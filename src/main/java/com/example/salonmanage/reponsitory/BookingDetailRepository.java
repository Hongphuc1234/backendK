package com.example.salonmanage.reponsitory;

import com.example.salonmanage.Entities.BookingDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingDetailRepository extends JpaRepository<BookingDetail,Long> {
}
