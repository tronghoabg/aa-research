package P9;

import java.io.IOException;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9268a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f9269b;

    public /* synthetic */ b(c cVar, int i5) {
        this.f9268a = i5;
        this.f9269b = cVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        Q9.b bVarU;
        Q9.b bVarI;
        switch (this.f9268a) {
            case 0:
                this.f9269b.b();
                return;
            case 1:
                this.f9269b.b();
                return;
            default:
                c cVar = this.f9269b;
                cVar.getClass();
                synchronized (c.f9270m) {
                    try {
                        s8.g gVar = cVar.f9271a;
                        gVar.a();
                        S3.e eVarJ = S3.e.j(gVar.f45328a);
                        try {
                            bVarU = cVar.f9273c.u();
                            if (eVarJ != null) {
                                eVarJ.w();
                            }
                        } catch (Throwable th) {
                            if (eVarJ != null) {
                                eVarJ.w();
                            }
                            throw th;
                        }
                    } finally {
                    }
                }
                try {
                    int i5 = bVarU.f9920b;
                    if (i5 == 5) {
                        bVarI = cVar.i(bVarU);
                    } else {
                        if (i5 == 3) {
                            bVarI = cVar.i(bVarU);
                        } else if (!cVar.f9274d.a(bVarU)) {
                            return;
                        } else {
                            bVarI = cVar.c(bVarU);
                        }
                    }
                    cVar.f(bVarI);
                    cVar.m(bVarU, bVarI);
                    if (bVarI.f9920b == 4) {
                        cVar.l(bVarI.f9919a);
                    }
                    int i10 = bVarI.f9920b;
                    if (i10 == 5) {
                        cVar.j(new e());
                        return;
                    } else if (i10 == 2 || i10 == 1) {
                        cVar.j(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        cVar.k(bVarI);
                        return;
                    }
                } catch (e e7) {
                    cVar.j(e7);
                    return;
                }
        }
    }
}
