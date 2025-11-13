package bookborrowing.reservation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import bookborrowing.reservation.Reservation;
import bookborrowing.auth.Users;
import java.util.Optional;


public interface ReservationRepository extends JpaRepository<Users, Long> {

}

