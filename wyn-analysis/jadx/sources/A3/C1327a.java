package a3;

import Q1.o;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import l8.AbstractC3409K;
import l8.C3407I;
import l8.e0;
import s2.j;
import s2.m;
import s2.n;
import s2.y;

/* renamed from: a3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1327a implements m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17333a;

    /* renamed from: b, reason: collision with root package name */
    public final o f17334b;

    /* renamed from: c, reason: collision with root package name */
    public final y f17335c;

    public C1327a(int i5) {
        this.f17333a = i5;
        switch (i5) {
            case 1:
                this.f17334b = new o(4);
                this.f17335c = new y(-1, -1, "image/avif");
                break;
            case 2:
                this.f17334b = new o(4);
                this.f17335c = new y(-1, -1, "image/heif");
                break;
            default:
                this.f17334b = new o(4);
                this.f17335c = new y(-1, -1, "image/webp");
                break;
        }
    }

    @Override // s2.m
    public final void a(long j8, long j10) {
        switch (this.f17333a) {
            case 0:
                this.f17335c.a(j8, j10);
                break;
            case 1:
                this.f17335c.a(j8, j10);
                break;
            default:
                this.f17335c.a(j8, j10);
                break;
        }
    }

    @Override // s2.m
    public final void g(s2.o oVar) {
        switch (this.f17333a) {
            case 0:
                this.f17335c.g(oVar);
                break;
            case 1:
                this.f17335c.g(oVar);
                break;
            default:
                this.f17335c.g(oVar);
                break;
        }
    }

    @Override // s2.m
    public final m h() {
        int i5 = this.f17333a;
        return this;
    }

    @Override // s2.m
    public final boolean i(n nVar) throws EOFException, InterruptedIOException {
        switch (this.f17333a) {
            case 0:
                o oVar = this.f17334b;
                oVar.D(4);
                j jVar = (j) nVar;
                jVar.c(oVar.f9702a, 0, 4, false);
                if (oVar.w() == 1380533830) {
                    jVar.b(4, false);
                    oVar.D(4);
                    jVar.c(oVar.f9702a, 0, 4, false);
                    if (oVar.w() == 1464156752) {
                    }
                }
                break;
            case 1:
                j jVar2 = (j) nVar;
                jVar2.b(4, false);
                o oVar2 = this.f17334b;
                oVar2.D(4);
                jVar2.c(oVar2.f9702a, 0, 4, false);
                if (oVar2.w() == 1718909296) {
                    oVar2.D(4);
                    jVar2.c(oVar2.f9702a, 0, 4, false);
                    if (oVar2.w() == 1635150182) {
                    }
                }
                break;
            default:
                j jVar3 = (j) nVar;
                jVar3.b(4, false);
                o oVar3 = this.f17334b;
                oVar3.D(4);
                jVar3.c(oVar3.f9702a, 0, 4, false);
                if (oVar3.w() == 1718909296) {
                    oVar3.D(4);
                    jVar3.c(oVar3.f9702a, 0, 4, false);
                    if (oVar3.w() == 1751476579) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // s2.m
    public final List j() {
        switch (this.f17333a) {
            case 0:
                C3407I c3407i = AbstractC3409K.f40056b;
                break;
            case 1:
                C3407I c3407i2 = AbstractC3409K.f40056b;
                break;
            default:
                C3407I c3407i3 = AbstractC3409K.f40056b;
                break;
        }
        return e0.f40101e;
    }

    @Override // s2.m
    public final int k(n nVar, J5.n nVar2) {
        switch (this.f17333a) {
        }
        return this.f17335c.k(nVar, nVar2);
    }

    @Override // s2.m
    public final void release() {
        int i5 = this.f17333a;
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }
}
