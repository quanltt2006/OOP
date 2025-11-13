🚀 Tính năng chính
🏠 Màn hình chính

Login Screen

Người chơi đăng nhập bằng tài khoản đã có trong cơ sở dữ liệu.

Nếu chưa có tài khoản, có thể đăng ký mới.

Dữ liệu người chơi được lưu trong Database (Singleton Pattern).

Main Menu

Hiển thị các tùy chọn:

New Game
Score
Exit 

Hiển thị danh sách 15 màn chơi.

Các màn mới sẽ được mở khóa khi người chơi vượt qua màn trước đó.

Mỗi màn hiển thị số sao đạt được (1–3), tùy theo điểm số của người chơi.

Shop Screen

Cho phép người chơi:

Mua Paddle với thiết kế khác nhau.

Mua Power-up để sử dụng trước mỗi màn chơi.

Dữ liệu vật phẩm được lưu và cập nhật trong cơ sở dữ liệu.

Game Scene

Lối chơi Arkanoid cổ điển: người chơi điều khiển Paddle để bật Ball phá Brick.

Có hệ thống Power-up rơi ngẫu nhiên khi phá gạch.

Khi hoàn thành màn chơi, người chơi nhận được điểm, sao và có thể mở khóa màn tiếp theo.

🌟 Hệ thống điểm và sao

Sao (⭐) là thước đo thành tích của người chơi trong mỗi màn:

Số sao	Điều kiện
⭐	Điểm thấp (vượt qua màn)
⭐⭐	Điểm trung bình
⭐⭐⭐	Điểm cao nhất

Sao được lưu trong cơ sở dữ liệu và hiển thị ở màn Level Selection.

💥 Power-ups

Có nhiều loại Power-up (ví dụ: tăng kích thước Paddle, nhân đôi bóng, xuyên gạch, v.v.)

Người chơi có thể mua Power-up tại Shop và chọn Power-up trước khi bắt đầu màn chơi.

Các Power-up được khởi tạo thông qua Abstract Factory Pattern giúp dễ dàng mở rộng và bảo trì.

🧩 Các mẫu thiết kế (Design Patterns) được sử dụng
Mẫu thiết kế	Vị trí ứng dụng	Mô tả
Singleton	Database	Đảm bảo chỉ có một kết nối cơ sở dữ liệu duy nhất trong toàn bộ ứng dụng.
Prototype	Ball	Cho phép sao chép nhanh các đối tượng bóng (Ball) mà không cần khởi tạo lại toàn bộ.
Abstract Factory	PowerUp	Quản lý việc tạo ra các loại Power-up khác nhau (ví dụ: Offensive, Defensive, Special).
