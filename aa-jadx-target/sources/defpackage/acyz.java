package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class acyz implements defpackage.acyy {
    private static final defpackage.wdr a = new defpackage.wdr(defpackage.acmi.b, 16);

    @Override // defpackage.acyy
    public final long a() {
        return ((java.lang.Long) a.b(1, "UsbBabysitter__default_usb_function", -1L).fF()).longValue();
    }

    @Override // defpackage.acyy
    public final long b() {
        return ((java.lang.Long) a.b(5, "UsbBabysitter__stop_monitoring_delay_ms", 5000L).fF()).longValue();
    }

    @Override // defpackage.acyy
    public final long c() {
        return ((java.lang.Long) a.b(8, "UsbBabysitter__usb_mode_switch_disable_token", 0L).fF()).longValue();
    }

    @Override // defpackage.acyy
    public final long d() {
        return ((java.lang.Long) a.b(9, "UsbBabysitter__usb_mode_switch_initial_accessory_timeout_ms", 0L).fF()).longValue();
    }

    @Override // defpackage.acyy
    public final long e() {
        return ((java.lang.Long) a.b(11, "UsbBabysitter__usb_mode_switch_saved_mode_accessory_timeout_ms", 0L).fF()).longValue();
    }

    @Override // defpackage.acyy
    public final long f() {
        return ((java.lang.Long) a.b(14, "UsbBabysitter__usb_recovery_v2_accessory_timeout_ms", 10000L).fF()).longValue();
    }

    @Override // defpackage.acyy
    public final defpackage.rsc g() {
        return (defpackage.rsc) a.e(0, "UsbBabysitter__a2dp_fix_car_list", new defpackage.acvv(10), "ChQiC1ZvbHZvIFtBQVJdMgVBcHRpdg").fF();
    }

    @Override // defpackage.acyy
    public final rsf h() {
        return (rsf) a.e(3, "UsbBabysitter__mendel_configurable_event_detector_config", new defpackage.acuo(16), "Cv0DCvoDEgMYgA8aMAosY29tLmdvb2dsZS5hbmRyb2lkLmdtcy5jYXIuVVNCX1NUQVRFX0NIQU5HRUQQABovCi1jb20uZ29vZ2xlLmFuZHJvaWQuZ21zLmNhci5QUk9KRUNUSU9OX1NUQVJURUQgkE4wupwBOLucAUIZIhVNSUIgU3RhbmRhcmQyIFpSIFBsdXMoAUIRIg1NSUIgRW50cnkgMkdQKAFCGCIUTUlCIFN0YW5kYXJkMiBaUiBOYXYoAUIcIhhDb25uZWN0aXZpdHkgTWFzdGVyIFVuaXQoAUIXIhNWUDNfNFIgVWNvbm5lY3QgOF80KAFCCSIFTUlCMisoAUIOIgpTdWJhcnVfTWlkKAFCESINTUlCMyBFaW5zdGllZygBQigiJDIwTVkgQ29ja3BpdCBDb250cm9sIFVuaXQgSGlnaCBNb2RlbCgBQg8iC1N1YmFydV9CYXNlKAFCGSIVTUlCIFN0YW5kYXJkMiBQUSBQbHVzKAFCDSIJVFI4MTcxLzA2KAFCCSIFTUlCM0goAUIVIhFJbkNvbnRyb2xUb3VjaFBybygBQgkiBU1JQjNCKAFCByIDTkFDKAFCCSIFNDUzMjMoAUIMIghGb3JkIENUUigBQgUiAU0oAUIMIghTWU5DIDQuMCgBUg9GVU5DVElPTl9TRUFSQ0gKmwQKmAQSMAosY29tLmdvb2dsZS5hbmRyb2lkLmdtcy5jYXIuVVNCX1NUQVRFX0NIQU5HRUQQABovCi1jb20uZ29vZ2xlLmFuZHJvaWQuZ21zLmNhci5QUk9KRUNUSU9OX1NUQVJURUQaIAoeY29tLmdvb2dsZS5hbmRyb2lkLmdtcy5jYXIuRlJYIKCcATC8nAE4vZwBQhkiFU1JQiBTdGFuZGFyZDIgWlIgUGx1cygBQhEiDU1JQiBFbnRyeSAyR1AoAUIYIhRNSUIgU3RhbmRhcmQyIFpSIE5hdigBQhwiGENvbm5lY3Rpdml0eSBNYXN0ZXIgVW5pdCgBQhciE1ZQM180UiBVY29ubmVjdCA4XzQoAUIJIgVNSUIyKygBQg4iClN1YmFydV9NaWQoAUIRIg1NSUIzIEVpbnN0aWVnKAFCKCIkMjBNWSBDb2NrcGl0IENvbnRyb2wgVW5pdCBIaWdoIE1vZGVsKAFCDyILU3ViYXJ1X0Jhc2UoAUIZIhVNSUIgU3RhbmRhcmQyIFBRIFBsdXMoAUINIglUUjgxNzEvMDYoAUIJIgVNSUIzSCgBQhUiEUluQ29udHJvbFRvdWNoUHJvKAFCCSIFTUlCM0IoAUIHIgNOQUMoAUIJIgU0NTMyMygBQgwiCEZvcmQgQ1RSKAFCBSIBTSgBQgwiCFNZTkMgNC4wKAFSD0ZVTkNUSU9OX1NFQVJDSArdAwraAxIDGIAPGi8KLWNvbS5nb29nbGUuYW5kcm9pZC5nbXMuY2FyLlBST0pFQ1RJT05fU1RBUlRFRBogCh5jb20uZ29vZ2xlLmFuZHJvaWQuZ21zLmNhci5GUlggsOoBMLScATi1nAFCGSIVTUlCIFN0YW5kYXJkMiBaUiBQbHVzKABCESINTUlCIEVudHJ5IDJHUCgAQhgiFE1JQiBTdGFuZGFyZDIgWlIgTmF2KABCHCIYQ29ubmVjdGl2aXR5IE1hc3RlciBVbml0KABCFyITVlAzXzRSIFVjb25uZWN0IDhfNCgAQgkiBU1JQjIrKABCDiIKU3ViYXJ1X01pZCgAQhEiDU1JQjMgRWluc3RpZWcoAEIoIiQyME1ZIENvY2twaXQgQ29udHJvbCBVbml0IEhpZ2ggTW9kZWwoAEIPIgtTdWJhcnVfQmFzZSgAQhkiFU1JQiBTdGFuZGFyZDIgUFEgUGx1cygAQg0iCVRSODE3MS8wNigAQgkiBU1JQjNIKABCFSIRSW5Db250cm9sVG91Y2hQcm8oAEIJIgVNSUIzQigAQgciA05BQygAQgkiBTQ1MzIzKABCDCIIRm9yZCBDVFIoAEIFIgFNKABCDCIIU1lOQyA0LjAoAA").fF();
    }

    @Override // defpackage.acyy
    public final defpackage.absw i() {
        return (defpackage.absw) a.e(13, "UsbBabysitter__usb_recovery_functions", new defpackage.acuo(17), "CgQEEAAI").fF();
    }

    @Override // defpackage.acyy
    public final boolean j() {
        return ((java.lang.Boolean) a.d(2, "UsbBabysitter__enable_a2dp_at_projection_end", false).fF()).booleanValue();
    }

    @Override // defpackage.acyy
    public final boolean k() {
        return ((java.lang.Boolean) a.d(4, "UsbBabysitter__start_from_wireless_service", false).fF()).booleanValue();
    }

    @Override // defpackage.acyy
    public final boolean l() {
        return ((java.lang.Boolean) a.d(6, "UsbBabysitter__switch_usb_function_on_bluetooth_connect", false).fF()).booleanValue();
    }

    @Override // defpackage.acyy
    public final boolean m() {
        return ((java.lang.Boolean) a.d(7, "UsbBabysitter__switch_usb_function_on_usb_disconnect", false).fF()).booleanValue();
    }

    @Override // defpackage.acyy
    public final boolean n() {
        return ((java.lang.Boolean) a.d(10, "UsbBabysitter__usb_mode_switch_q3_updates", false).fF()).booleanValue();
    }

    @Override // defpackage.acyy
    public final boolean o() {
        return ((java.lang.Boolean) a.d(12, "UsbBabysitter__usb_mode_switch_set_saved_mode_when_not_connected", false).fF()).booleanValue();
    }

    @Override // defpackage.acyy
    public final boolean p() {
        return ((java.lang.Boolean) a.d(15, "UsbBabysitter__use_combined_usb_datasource", false).fF()).booleanValue();
    }
}
