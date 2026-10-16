package Pc;

import ba.C1521a;
import dd.C2428g;
import java.util.ArrayList;
import yc.C4592o;
import yc.InterfaceC4573C;
import yc.InterfaceC4574D;

/* renamed from: Pc.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0801q implements Qc.h, Uc.y, dd.j, dd.m, InterfaceC4573C, InterfaceC4574D {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9434a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f9435b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1521a f9436c;

    public /* synthetic */ C0801q(ArrayList arrayList, C1521a c1521a, int i5) {
        this.f9434a = i5;
        this.f9435b = arrayList;
        this.f9436c = c1521a;
    }

    @Override // Qc.h, dd.j
    public void a(Object obj) {
        switch (this.f9434a) {
            case 0:
                ArrayList arrayList = this.f9435b;
                arrayList.add(0, (M) obj);
                this.f9436c.c(arrayList);
                break;
            case 1:
            case 2:
            case 8:
            default:
                ArrayList arrayList2 = this.f9435b;
                arrayList2.add(0, (String) obj);
                this.f9436c.c(arrayList2);
                break;
            case 3:
                ArrayList arrayList3 = this.f9435b;
                arrayList3.add(0, (M) obj);
                this.f9436c.c(arrayList3);
                break;
            case 4:
                ArrayList arrayList4 = this.f9435b;
                arrayList4.add(0, (N) obj);
                this.f9436c.c(arrayList4);
                break;
            case 5:
                ArrayList arrayList5 = this.f9435b;
                arrayList5.add(0, (N) obj);
                this.f9436c.c(arrayList5);
                break;
            case 6:
                ArrayList arrayList6 = this.f9435b;
                arrayList6.add(0, (G) obj);
                this.f9436c.c(arrayList6);
                break;
            case 7:
                ArrayList arrayList7 = this.f9435b;
                arrayList7.add(0, (M) obj);
                this.f9436c.c(arrayList7);
                break;
            case 9:
                ArrayList arrayList8 = this.f9435b;
                arrayList8.add(0, (L) obj);
                this.f9436c.c(arrayList8);
                break;
            case 10:
                ArrayList arrayList9 = this.f9435b;
                arrayList9.add(0, (I) obj);
                this.f9436c.c(arrayList9);
                break;
            case 11:
                ArrayList arrayList10 = this.f9435b;
                arrayList10.add(0, null);
                this.f9436c.c(arrayList10);
                break;
            case 12:
                ArrayList arrayList11 = this.f9435b;
                arrayList11.add(0, (Qc.f) obj);
                this.f9436c.c(arrayList11);
                break;
            case 13:
                ArrayList arrayList12 = this.f9435b;
                arrayList12.add(0, null);
                this.f9436c.c(arrayList12);
                break;
            case 14:
                ArrayList arrayList13 = this.f9435b;
                arrayList13.add(0, null);
                this.f9436c.c(arrayList13);
                break;
            case 15:
                ArrayList arrayList14 = this.f9435b;
                arrayList14.add(0, null);
                this.f9436c.c(arrayList14);
                break;
            case 16:
                ArrayList arrayList15 = this.f9435b;
                arrayList15.add(0, null);
                this.f9436c.c(arrayList15);
                break;
            case 17:
                ArrayList arrayList16 = this.f9435b;
                arrayList16.add(0, null);
                this.f9436c.c(arrayList16);
                break;
            case 18:
                ArrayList arrayList17 = this.f9435b;
                arrayList17.add(0, null);
                this.f9436c.c(arrayList17);
                break;
            case 19:
                ArrayList arrayList18 = this.f9435b;
                arrayList18.add(0, (dd.l) obj);
                this.f9436c.c(arrayList18);
                break;
        }
    }

    @Override // Qc.h, Uc.y
    public void b(Exception exc) {
        switch (this.f9434a) {
            case 0:
                this.f9436c.c(android.support.v4.media.session.b.w0(exc));
                break;
            case 1:
                this.f9436c.c(android.support.v4.media.session.b.w0(exc));
                break;
            case 2:
                this.f9436c.c(android.support.v4.media.session.b.w0(exc));
                break;
            case 3:
                this.f9436c.c(android.support.v4.media.session.b.w0(exc));
                break;
            case 4:
                this.f9436c.c(android.support.v4.media.session.b.w0(exc));
                break;
            case 5:
                this.f9436c.c(android.support.v4.media.session.b.w0(exc));
                break;
            case 6:
                this.f9436c.c(android.support.v4.media.session.b.w0(exc));
                break;
            case 7:
                this.f9436c.c(android.support.v4.media.session.b.w0(exc));
                break;
            case 8:
                this.f9436c.c(android.support.v4.media.session.b.w0(exc));
                break;
            case 9:
                this.f9436c.c(android.support.v4.media.session.b.w0(exc));
                break;
            case 10:
                this.f9436c.c(android.support.v4.media.session.b.w0(exc));
                break;
            case 11:
                this.f9436c.c(gc.b.N(exc));
                break;
            case 12:
                this.f9436c.c(gc.b.N(exc));
                break;
            case 13:
                this.f9436c.c(A6.h.R(exc));
                break;
            case 14:
                this.f9436c.c(A6.h.R(exc));
                break;
            case 15:
                this.f9436c.c(A6.h.R(exc));
                break;
            case 16:
                this.f9436c.c(A6.h.R(exc));
                break;
            case 17:
                this.f9436c.c(A6.h.R(exc));
                break;
            default:
                this.f9436c.c(A6.h.R(exc));
                break;
        }
    }

    @Override // yc.InterfaceC4573C
    public void c(C4592o c4592o) {
        switch (this.f9434a) {
            case 21:
                this.f9436c.c(Fe.b.V(c4592o));
                break;
            case 22:
                this.f9436c.c(Fe.b.V(c4592o));
                break;
            default:
                this.f9436c.c(Fe.b.V(c4592o));
                break;
        }
    }

    @Override // dd.j, dd.m
    public void d(C2428g c2428g) {
        switch (this.f9434a) {
            case 19:
                this.f9436c.c(tg.b.V(c2428g));
                break;
            default:
                this.f9436c.c(tg.b.V(c2428g));
                break;
        }
    }

    @Override // dd.m
    public void success() {
        switch (this.f9434a) {
            case 1:
                ArrayList arrayList = this.f9435b;
                arrayList.add(0, null);
                this.f9436c.c(arrayList);
                break;
            case 2:
                ArrayList arrayList2 = this.f9435b;
                arrayList2.add(0, null);
                this.f9436c.c(arrayList2);
                break;
            case 8:
                ArrayList arrayList3 = this.f9435b;
                arrayList3.add(0, null);
                this.f9436c.c(arrayList3);
                break;
            case 20:
                ArrayList arrayList4 = this.f9435b;
                arrayList4.add(0, null);
                this.f9436c.c(arrayList4);
                break;
            case 22:
                ArrayList arrayList5 = this.f9435b;
                arrayList5.add(0, null);
                this.f9436c.c(arrayList5);
                break;
            default:
                ArrayList arrayList6 = this.f9435b;
                arrayList6.add(0, null);
                this.f9436c.c(arrayList6);
                break;
        }
    }
}
