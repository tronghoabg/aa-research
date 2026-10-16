package com.waze.navigate;

import android.text.TextUtils;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ct implements com.waze.destination_cell.a.a {

    /* renamed from: a, reason: collision with root package name */
    final AddressItem f31196a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.o.a f31197b = com.waze.shared_infra.o.b.a();

    public ct(AddressItem addressItem) {
        this.f31196a = addressItem;
    }

    @Override // com.waze.destination_cell.a.a
    public final int a() {
        int iJ = j();
        if (iJ == 1 || iJ == 2) {
            return R.string.contentDescription_addressHome;
        }
        if (iJ == 3 || iJ == 4) {
            return R.string.contentDescription_addressWork;
        }
        if (iJ != 9) {
            if (iJ != 12) {
                return -1;
            }
            return R.string.contentDescription_connectCalendar;
        }
        if (n()) {
            return R.string.contentDescription_plannedDrive;
        }
        return -1;
    }

    @Override // com.waze.destination_cell.a.a
    public final AddressItem b() {
        return this.f31196a;
    }

    @Override // com.waze.destination_cell.a.a
    public final Integer c() {
        return this.f31196a.getImage();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    @Override // com.waze.destination_cell.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String d() {
        /*
            r5 = this;
            int r0 = r5.j()
            java.lang.String r1 = ""
            r2 = 1
            if (r0 == r2) goto L87
            r3 = 2
            r4 = 0
            if (r0 == r3) goto L7b
            r3 = 3
            if (r0 == r3) goto L87
            r3 = 4
            if (r0 == r3) goto L7b
            r3 = 9
            if (r0 == r3) goto L4d
            r3 = 11
            if (r0 == r3) goto L39
            r3 = 16
            if (r0 == r3) goto L25
            java.lang.String r0 = r5.l()
            goto L8b
        L25:
            boolean r0 = r5.n()
            if (r0 == 0) goto L37
            com.waze.shared_infra.o.a r0 = r5.f31197b
            r3 = 2131888228(0x7f120864, float:1.9411085E38)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r0 = r0.c(r3, r4)
            goto L8b
        L37:
            r0 = r1
            goto L8b
        L39:
            java.lang.String r0 = r5.k()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L48
            java.lang.String r0 = r5.k()
            goto L8b
        L48:
            java.lang.String r0 = r5.l()
            goto L8b
        L4d:
            boolean r0 = r5.n()
            if (r0 == 0) goto L67
            java.lang.String r0 = r5.k()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L62
            java.lang.String r0 = r5.k()
            goto L8b
        L62:
            java.lang.String r0 = r5.m()
            goto L8b
        L67:
            java.lang.String r0 = r5.k()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L76
            java.lang.String r0 = r5.k()
            goto L8b
        L76:
            java.lang.String r0 = r5.l()
            goto L8b
        L7b:
            com.waze.shared_infra.o.a r0 = r5.f31197b
            r3 = 2131888244(0x7f120874, float:1.9411118E38)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r0 = r0.c(r3, r4)
            goto L8b
        L87:
            java.lang.String r0 = r5.k()
        L8b:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L95
            java.lang.String r0 = r5.k()
        L95:
            java.lang.String r3 = r0.trim()
            java.lang.String r5 = r5.e()
            boolean r5 = r3.equals(r5)
            if (r2 != r5) goto La4
            r0 = 0
        La4:
            if (r0 != 0) goto La7
            return r1
        La7:
            java.lang.String r5 = r0.trim()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.navigate.ct.d():java.lang.String");
    }

    @Override // com.waze.destination_cell.a.a
    public final String e() {
        String strI;
        int iJ = j();
        String strC = (iJ == 1 || iJ == 2) ? this.f31197b.c(R.string.NAVLIST_HOME, new Object[0]) : (iJ == 3 || iJ == 4) ? this.f31197b.c(R.string.NAVLIST_WORK, new Object[0]) : (iJ == 9 && n()) ? this.f31196a.getStartTime() : m();
        if (strC != null && !strC.isEmpty()) {
            String strTrim = strC.trim();
            AddressItem addressItem = this.f31196a;
            if (strTrim.equals(addressItem.getAddress()) && (strI = com.waze.nightmode.e.i(addressItem.getHouseNumber(), addressItem.getStreet())) != null && !strI.isEmpty()) {
                addressItem.setAddress(com.waze.nightmode.e.h(addressItem.getHouseNumber(), addressItem.getStreet(), addressItem.getCity(), addressItem.getState(), null));
                strC = strI;
            }
        }
        return strC == null ? "" : strC.trim();
    }

    @Override // com.waze.destination_cell.a.a
    public final String f() {
        return this.f31196a.getImageUrl();
    }

    @Override // com.waze.destination_cell.a.a
    public final String g() {
        AddressItem addressItem = this.f31196a;
        if (addressItem.hasIcon()) {
            return addressItem.getIcon();
        }
        return null;
    }

    @Override // com.waze.destination_cell.a.a
    public final boolean h() {
        if (i() == 2) {
            return false;
        }
        AddressItem addressItem = this.f31196a;
        return (TextUtils.isEmpty(addressItem.getId()) && TextUtils.isEmpty(addressItem.getMeetingId())) ? false : true;
    }

    @Override // com.waze.destination_cell.a.a
    public final int i() {
        int iJ = j();
        if (iJ != 1) {
            if (iJ != 2) {
                if (iJ != 3) {
                    if (iJ != 4 && iJ != 6) {
                        if (iJ != 9) {
                            if (iJ != 12) {
                            }
                        } else {
                            if (n()) {
                                return 5;
                            }
                            boolean isValidate = this.f31196a.getIsValidate();
                            Boolean.valueOf(isValidate).getClass();
                            if (!isValidate) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
            return 2;
        }
        return 4;
    }

    final int j() {
        return this.f31196a.getType();
    }

    final String k() {
        return this.f31196a.getAddress();
    }

    final String l() {
        return this.f31196a.getSecondaryTitle();
    }

    final String m() {
        return this.f31196a.getTitle();
    }

    final boolean n() {
        return this.f31196a.getCategory().intValue() == 9;
    }
}
