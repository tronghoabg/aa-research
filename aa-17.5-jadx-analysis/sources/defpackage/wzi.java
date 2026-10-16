package defpackage;

import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public enum wzi implements wyq {
    PHONE(R.drawable.quantum_ic_phone_vd_theme_24, R.string.permission_phone_name, R.string.permission_phone_description, mdj.a),
    CONTACTS(R.drawable.quantum_ic_contacts_vd_theme_24, R.string.permission_contacts_name, R.string.permission_contacts_description, mdj.b),
    LOCATION(2131233445, R.string.permission_location_name, R.string.permission_location_description, mdj.c),
    SMS(R.drawable.quantum_ic_sms_vd_theme_24, R.string.permission_sms_name, R.string.permission_sms_description, mdj.d),
    MICROPHONE(R.drawable.quantum_ic_mic_vd_theme_24, R.string.permission_microphone_name, R.string.permission_microphone_description, mdj.e),
    CALENDAR(R.drawable.quantum_ic_today_vd_theme_24, R.string.permission_calendar_name, R.string.permission_calendar_description, mdj.f),
    CALL_LOG(R.drawable.ic_call_log_white_24, R.string.permission_call_log_name, R.string.permission_call_log_description, mdj.g);

    final yfq h;
    private final int j;
    private final int k;
    private final int l;

    wzi(int i2, int i3, int i4, mdj mdjVar) {
        this.j = i2;
        this.k = i3;
        this.l = i4;
        this.h = lgv.c().a(mdjVar);
    }

    @Override // defpackage.wyq
    public final int a() {
        return this.l;
    }

    @Override // defpackage.wyq
    public final int b() {
        return this.j;
    }

    @Override // defpackage.wyq
    public final int c() {
        return this.k;
    }

    @Override // defpackage.wyq
    public final boolean d() {
        return lgv.c().j(this.h);
    }
}
