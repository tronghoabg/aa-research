package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class uhd {
    public final ArrayList a;
    public boolean b;
    public final uxc c;
    private final ukq d;
    private final urw e;
    private final utz f;
    private final boolean g;
    private final boolean h;
    private final roa i;

    public uhd(ukq ukqVar, roa roaVar, urw urwVar, utz utzVar, uxc uxcVar, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = false;
        this.d = ukqVar;
        this.i = roaVar;
        this.e = urwVar;
        this.f = utzVar;
        this.c = uxcVar;
        this.g = z;
        this.h = z2;
        arrayList.add(new ArrayList());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.utf r43, defpackage.tzm r44, defpackage.uvx r45, java.util.List r46, java.util.List r47, java.util.List r48) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uhd.a(utf, tzm, uvx, java.util.List, java.util.List, java.util.List):void");
    }

    public final void b() {
        ArrayList arrayList = this.a;
        if (((ArrayList) yrm.an(arrayList)).isEmpty()) {
            return;
        }
        arrayList.add(new ArrayList());
    }

    public final boolean c() {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            boolean zIsEmpty = ((ArrayList) arrayList.get(i)).isEmpty();
            i++;
            if (!zIsEmpty) {
                return true;
            }
        }
        return false;
    }
}
