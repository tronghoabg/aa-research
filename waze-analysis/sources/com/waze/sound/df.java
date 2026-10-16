package com.waze.sound;

import android.media.AudioDeviceInfo;
import com.waze.strings.DisplayStrings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class df implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f39763a;

    public /* synthetic */ df(int i2) {
        this.f39763a = i2;
    }

    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        boolean zE = true;
        char c2 = 1;
        int i2 = 10;
        switch (this.f39763a) {
            case 0:
                ck ckVar = (ck) obj;
                h.g.b.x.f(ckVar, "it");
                return ckVar.name();
            case 1:
                ck ckVar2 = (ck) obj;
                h.g.b.x.f(ckVar2, "it");
                return ckVar2.name();
            case 2:
                ak akVar = (ak) obj;
                h.g.b.x.f(akVar, "it");
                return akVar.b();
            case 3:
                ak akVar2 = (ak) obj;
                h.g.b.x.f(akVar2, "it");
                return akVar2.b();
            case 4:
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
                CharSequence productName = audioDeviceInfo.getProductName();
                return ((Object) productName) + " (type=" + audioDeviceInfo.getType() + ")";
            case 5:
                int i3 = com.waze.sound.e.b.f39836a;
                h.g.b.x.f((bp) obj, "it");
                return h.ab.f48028a;
            case 6:
                int i4 = com.waze.sound.e.b.f39836a;
                h.g.b.x.f((bp) obj, "it");
                return h.ab.f48028a;
            case 7:
                org.a.d.g.a aVar = (org.a.d.g.a) obj;
                int i5 = com.waze.bv.m.f17537a;
                h.g.b.x.f(aVar, "$this$module");
                com.waze.sound.e.a aVar2 = new com.waze.sound.e.a(6);
                org.a.d.i.b bVar = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar = org.a.d.c.c.f56383b;
                List listH = h.a.i.h();
                int i6 = h.g.b.ar.f48106a;
                org.a.d.e.a aVar3 = new org.a.d.e.a(new org.a.d.c.a(bVar, new h.g.b.m(com.waze.bv.c.class), null, aVar2, cVar, listH));
                aVar.f(aVar3);
                new org.a.d.c.d(aVar, aVar3);
                org.a.d.e.a aVar4 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.bv.q.class), null, new com.waze.sound.e.a(7), cVar, h.a.i.h()));
                aVar.f(aVar4);
                new org.a.d.c.d(aVar, aVar4);
                com.waze.sound.e.a aVar5 = new com.waze.sound.e.a(8);
                org.a.d.i.b bVar2 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar2 = org.a.d.c.c.f56382a;
                org.a.d.e.e eVar = new org.a.d.e.e(new org.a.d.c.a(bVar2, new h.g.b.m(com.waze.bv.i.class), null, aVar5, cVar2, h.a.i.h()));
                aVar.f(eVar);
                new org.a.d.c.d(aVar, eVar);
                org.a.d.e.e eVar2 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.bv.r.class), null, new com.waze.sound.e.a(9), cVar2, h.a.i.h()));
                aVar.f(eVar2);
                new org.a.d.c.d(aVar, eVar2);
                return h.ab.f48028a;
            case 8:
                org.a.d.g.a aVar6 = (org.a.d.g.a) obj;
                h.g.b.x.f(aVar6, "$this$module");
                com.waze.sound.e.a aVar7 = new com.waze.sound.e.a(i2);
                org.a.d.i.b bVar3 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar3 = org.a.d.c.c.f56383b;
                List listH2 = h.a.i.h();
                int i7 = h.g.b.ar.f48106a;
                org.a.d.e.a aVar8 = new org.a.d.e.a(new org.a.d.c.a(bVar3, new h.g.b.m(com.waze.bw.a.a.a.class), null, aVar7, cVar3, listH2));
                aVar6.f(aVar8);
                new org.a.d.c.d(aVar6, aVar8);
                org.a.d.e.a aVar9 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.bw.a.a.c.class), null, new com.waze.sound.e.a(11), cVar3, h.a.i.h()));
                aVar6.f(aVar9);
                new org.a.d.c.d(aVar6, aVar9);
                return h.ab.f48028a;
            case 9:
                org.a.d.g.a aVar10 = (org.a.d.g.a) obj;
                h.g.b.x.f(aVar10, "$this$module");
                com.waze.sound.e.a aVar11 = new com.waze.sound.e.a(12);
                org.a.d.i.b bVar4 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar4 = org.a.d.c.c.f56383b;
                List listH3 = h.a.i.h();
                int i8 = h.g.b.ar.f48106a;
                org.a.d.e.a aVar12 = new org.a.d.e.a(new org.a.d.c.a(bVar4, new h.g.b.m(com.waze.bw.a.b.k.class), null, aVar11, cVar4, listH3));
                aVar10.f(aVar12);
                new org.a.d.c.d(aVar10, aVar12);
                return h.ab.f48028a;
            case 10:
                com.waze.av.b.aa aaVar = (com.waze.av.b.aa) obj;
                h.g.b.x.f(aaVar, "place");
                List listB = aaVar.b();
                ArrayList arrayList = new ArrayList(h.a.i.q(listB, 10));
                Iterator it = listB.iterator();
                while (it.hasNext()) {
                    arrayList.add(new h.k((com.waze.av.b.c) it.next(), aaVar));
                }
                return arrayList;
            case 11:
                h.k kVar = (h.k) obj;
                h.g.b.x.f(kVar, "<destruct>");
                com.waze.av.b.c cVar5 = (com.waze.av.b.c) kVar.a();
                if (!(cVar5 instanceof com.waze.av.b.b)) {
                    if (!(cVar5 instanceof com.waze.av.b.a)) {
                        throw new h.i();
                    }
                    zE = ((com.waze.av.b.a) cVar5).e();
                }
                return Boolean.valueOf(zE);
            case 12:
                org.a.d.g.a aVar13 = (org.a.d.g.a) obj;
                h.g.b.x.f(aVar13, "$this$module");
                com.waze.sound.e.a aVar14 = new com.waze.sound.e.a(13);
                org.a.d.i.b bVar5 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar6 = org.a.d.c.c.f56383b;
                List listH4 = h.a.i.h();
                int i9 = h.g.b.ar.f48106a;
                org.a.d.e.a aVar15 = new org.a.d.e.a(new org.a.d.c.a(bVar5, new h.g.b.m(com.waze.bw.b.a.k.class), null, aVar14, cVar6, listH4));
                aVar13.f(aVar15);
                new org.a.d.c.d(aVar13, aVar15);
                org.a.d.e.a aVar16 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.bw.b.a.q.class), null, new com.waze.sound.e.a(14), cVar6, h.a.i.h()));
                aVar13.f(aVar16);
                new org.a.d.c.d(aVar13, aVar16);
                org.a.d.e.a aVar17 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.bw.b.a.p.class), null, new com.waze.sound.e.a(15), cVar6, h.a.i.h()));
                aVar13.f(aVar17);
                new org.a.d.c.d(aVar13, aVar17);
                return h.ab.f48028a;
            case 13:
                org.a.d.g.a aVar18 = (org.a.d.g.a) obj;
                h.g.b.x.f(aVar18, "$this$module");
                com.waze.sound.e.a aVar19 = new com.waze.sound.e.a(16);
                org.a.d.i.b bVar6 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar7 = org.a.d.c.c.f56383b;
                List listH5 = h.a.i.h();
                int i10 = h.g.b.ar.f48106a;
                org.a.d.e.a aVar20 = new org.a.d.e.a(new org.a.d.c.a(bVar6, new h.g.b.m(com.waze.bw.b.b.h.class), null, aVar19, cVar7, listH5));
                aVar18.f(aVar20);
                new org.a.d.c.d(aVar18, aVar20);
                return h.ab.f48028a;
            case 14:
                org.a.d.g.a aVar21 = (org.a.d.g.a) obj;
                h.g.b.x.f(aVar21, "$this$module");
                com.waze.sound.e.a aVar22 = new com.waze.sound.e.a(17);
                org.a.d.i.b bVar7 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar8 = org.a.d.c.c.f56383b;
                List listH6 = h.a.i.h();
                int i11 = h.g.b.ar.f48106a;
                org.a.d.e.a aVar23 = new org.a.d.e.a(new org.a.d.c.a(bVar7, new h.g.b.m(com.waze.bw.c.a.a.class), null, aVar22, cVar8, listH6));
                aVar21.f(aVar23);
                new org.a.d.c.d(aVar21, aVar23);
                org.a.d.e.e eVar3 = new org.a.d.e.e(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.bw.c.a.c.class), null, new com.waze.sound.e.a(18), org.a.d.c.c.f56382a, h.a.i.h()));
                aVar21.f(eVar3);
                new org.a.d.c.d(aVar21, eVar3);
                org.a.d.e.a aVar24 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.bw.c.a.h.class), null, new com.waze.sound.e.a(19), cVar8, h.a.i.h()));
                aVar21.f(aVar24);
                new org.a.d.c.d(aVar21, aVar24);
                org.a.d.e.a aVar25 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.bw.c.a.j.class), null, new com.waze.sound.e.a(20), cVar8, h.a.i.h()));
                aVar21.f(aVar25);
                new org.a.d.c.d(aVar21, aVar25);
                return h.ab.f48028a;
            case 15:
                org.a.d.g.a aVar26 = (org.a.d.g.a) obj;
                h.g.b.x.f(aVar26, "$this$module");
                com.waze.bw.c.b.e eVar4 = new com.waze.bw.c.b.e(c2 == true ? 1 : 0);
                org.a.d.i.b bVar8 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar9 = org.a.d.c.c.f56383b;
                List listH7 = h.a.i.h();
                int i12 = h.g.b.ar.f48106a;
                org.a.d.e.a aVar27 = new org.a.d.e.a(new org.a.d.c.a(bVar8, new h.g.b.m(com.waze.bw.c.b.a.class), null, eVar4, cVar9, listH7));
                aVar26.f(aVar27);
                new org.a.d.c.d(aVar26, aVar27);
                org.a.d.e.a aVar28 = new org.a.d.e.a(new org.a.d.c.a(org.a.d.j.a.f56411b, new h.g.b.m(com.waze.bw.c.b.c.class), null, new com.waze.bw.c.b.e(0), cVar9, h.a.i.h()));
                aVar26.f(aVar28);
                new org.a.d.c.d(aVar26, aVar28);
                return h.ab.f48028a;
            case 16:
                org.a.d.g.a aVar29 = (org.a.d.g.a) obj;
                h.g.b.x.f(aVar29, "$this$module");
                com.waze.bw.c.b.e eVar5 = new com.waze.bw.c.b.e(2);
                org.a.d.i.b bVar9 = org.a.d.j.a.f56411b;
                org.a.d.c.c cVar10 = org.a.d.c.c.f56383b;
                List listH8 = h.a.i.h();
                int i13 = h.g.b.ar.f48106a;
                org.a.d.e.a aVar30 = new org.a.d.e.a(new org.a.d.c.a(bVar9, new h.g.b.m(com.waze.bw.c.c.x.class), null, eVar5, cVar10, listH8));
                aVar29.f(aVar30);
                new org.a.d.c.d(aVar29, aVar30);
                return h.ab.f48028a;
            case 17:
                com.waze.av.b.aa aaVar2 = (com.waze.av.b.aa) obj;
                h.g.b.x.f(aaVar2, "it");
                return aaVar2.c();
            case 18:
                com.waze.av.b.f fVar = (com.waze.av.b.f) obj;
                h.g.b.x.f(fVar, "it");
                return new com.waze.bw.c.d.bn(fVar.a(), fVar.d());
            case 19:
                return com.waze.bw.c.d.cf.i((com.waze.bw.c.d.cf) obj, new com.waze.bw.c.d.bu(com.waze.bw.c.d.bt.f18001c), null, null, null, false, false, false, false, DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_2W_2);
            default:
                int i14 = com.waze.bw.c.d.b.f17977a;
                h.g.b.x.f((com.waze.bw.c.d.bp) obj, "it");
                return h.ab.f48028a;
        }
    }
}
