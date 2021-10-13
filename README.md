# Intent
<p>Intent
Intent adalah sebuah kelas dalam programming Android yang berfungsi untuk perpindahan 
halaman dan juga mekanisme untuk melakukan sebuah action dan komunikasi antar 
komponen aplikasi misal activity, services, dan broadcast receiver. Intent juga merupakan 
suatu objek yang terdapat dalam suatu activity dimana objek tersebut dapat komunikasi 
dengan activity yang lain, baik activity pada fungsi internal android misal seperti 
memanggil activity dalam satu package atau beda package yang masih berada dalam satu 
project.
Terdapat tiga penggunaan umum intent dalam aplikasi Android yaitu: Memindahkan satu 
activity ke activity lain dengan atau tidak membawa data. Menjalankan background 
service, misalnya melakukan sinkronisasi ke server dan menjalankan proses berulang 
(periodic/scheduler task). Mengirimkan obyek broadcast ke aplikasi yang membutuhkan. 
Misal, ketika aplikasi membutuhkan proses menjalankan sebuah background service setiap 
kali aplikasi selesai melakukan booting. Aplikasi harus bisa menerima obyek broadcast 
yang dikirimkan oleh sistem Android untuk event booting tersebut.
Intent merupakan objek tipe android.content.Intent. Melalui metode startActivity() yang 
digunakan untuk memulai sebuah activity lain. 
<h1>Intent Implicit<h1>
<p>
Implicit Intent berfungsi untuk memanggil fungsi activity yang sudah ada di fungsi 
internal android seperti Dial Number, Open Browser dan lainnya. Tipe intent ini tidak 
memerlukan detail nama kelas yang ingin diaktifkan. Model ini memungkinkan 
komponen dari aplikasi lain bisa merespon request intent yang dijalankan. Penggunaan 
tipe intent ini umumnya diperuntukan untuk menjalankan fitur/fungsi dari komponen
aplikasi lain. Contohnya ketika kita membutuhkan fitur untuk mengambil foto. 
Daripada membuat sendiri fungsi kamera, lebih baik kita menyerahkan proses tersebut 
pada aplikasi kamera bawaan dari peranti atau aplikasi kamera lain yang telah terinstal 
sebelumnya di peranti. Hal yang sama misalnya ketika kita membutuhkan fungsi 
berbagi konten. Kita bisa memanfaatkan intent untuk menampilkan aplikasi mana saja 
yang bisa menangani fitur tersebut. Implementasi implicit intent ini akan sangat 
memudahkan bagi pengembang agar tetap fokus pada proses bisnis inti dari aplikasi 
yang dikembangkan.</p>
