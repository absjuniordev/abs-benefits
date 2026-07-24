package com.absjrdev.absbenefits.benefitsWallet.repository;

import com.absjrdev.absbenefits.benefitsWallet.domain.BenefitsWallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BenefitsWalletRepository extends JpaRepository<BenefitsWallet, Long> {
}
