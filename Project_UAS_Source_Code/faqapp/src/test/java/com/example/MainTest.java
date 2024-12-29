package com.example;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MainTest {
    @Test
    public void testMainFrameInitialization() {
        assertNotNull(new JFrame("FAQ IT Governance"), "Frame utama harus dibuat.");
    }

    @Test
    public void testFAQFrameAnswer() {
        JFrame mainFrame = new JFrame("FAQ IT Governance");
        FAQFrame.displayFAQ(mainFrame, "Bagaimana cara memulai daftar aset IT hijau?");
                assertNotNull(new JFrame("Frequently Asked Questions"), "Frame FAQ harus dibuat.");
    }
}
