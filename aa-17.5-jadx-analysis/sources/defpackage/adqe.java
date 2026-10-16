package defpackage;

import android.os.Parcel;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* loaded from: classes3.dex */
abstract class adqe {
    private boolean a;
    private InputStream b;
    private Queue c;
    public final adoz d;
    public final int e;
    public final adzv f;
    private boolean g;
    private int h;
    private int i;
    private int j;
    private int k = 1;

    public adqe(adoz adozVar, int i, adzv adzvVar) {
        this.d = adozVar;
        this.e = i;
        this.f = adzvVar;
    }

    private final void c(int i) {
        int i2 = this.k;
        int i3 = i - 1;
        if (i3 == 1) {
            woy.Z(i2 == 1);
        } else if (i3 == 2) {
            woy.Z(i2 == 2);
        } else if (i3 == 3) {
            woy.Z(i2 == 3);
        }
        this.k = i;
    }

    protected abstract int a(Parcel parcel) throws IOException, adnr;

    protected abstract int b(Parcel parcel) throws IOException, adnr;

    final void d(InputStream inputStream) throws adnr {
        e();
        Queue queue = this.c;
        if (queue != null) {
            queue.add(inputStream);
        } else {
            if (this.b == null) {
                this.b = inputStream;
                return;
            }
            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
            this.c = concurrentLinkedQueue;
            concurrentLinkedQueue.add(inputStream);
        }
    }

    protected final void e() {
        this.a = true;
    }

    protected final void f() {
        this.g = true;
    }

    final void g() throws adnr {
        int iA;
        int i;
        while (true) {
            int i2 = this.k;
            int i3 = i2 - 1;
            InputStream inputStream = null;
            if (i2 == 0) {
                throw null;
            }
            boolean z = true;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2 || !this.g) {
                        return;
                    }
                } else if (!i() && !this.g) {
                    return;
                }
            } else if (!this.a) {
                return;
            }
            if (!h()) {
                return;
            }
            try {
                try {
                    adqf adqfVarC = adqf.c();
                    try {
                        int i4 = 0;
                        adqfVarC.a().writeInt(0);
                        Parcel parcelA = adqfVarC.a();
                        int i5 = this.h;
                        this.h = i5 + 1;
                        parcelA.writeInt(i5);
                        int i6 = this.k;
                        int i7 = i6 - 1;
                        if (i6 == 0) {
                            throw null;
                        }
                        if (i7 == 0) {
                            iA = a(adqfVarC.a()) | 1;
                            c(2);
                            if (i() || this.g) {
                            }
                            adqs.j(adqfVarC.a(), iA);
                            int iDataSize = adqfVarC.a().dataSize();
                            this.d.v(this.e, adqfVarC);
                            adzv adzvVar = this.f;
                            adzvVar.c(iDataSize);
                            adzv.g(adzvVar);
                            adqfVarC.close();
                        } else if (i7 == 1) {
                            iA = 0;
                        } else {
                            if (i7 != 2) {
                                throw new AssertionError();
                            }
                            iA = i4 | 4 | b(adqfVarC.a());
                            c(4);
                            adqs.j(adqfVarC.a(), iA);
                            int iDataSize2 = adqfVarC.a().dataSize();
                            this.d.v(this.e, adqfVarC);
                            adzv adzvVar2 = this.f;
                            adzvVar2.c(iDataSize2);
                            adzv.g(adzvVar2);
                            adqfVarC.close();
                        }
                        if (this.i == 0) {
                            inputStream = this.b;
                        } else {
                            Queue queue = this.c;
                            if (queue != null) {
                                inputStream = (InputStream) queue.peek();
                            }
                        }
                        if (inputStream != null) {
                            int i8 = iA | 2;
                            Parcel parcelA2 = adqfVarC.a();
                            if (inputStream instanceof adqg) {
                                this.j = ((adqg) inputStream).a(parcelA2);
                                i = 64;
                                z = false;
                            } else {
                                byte[] bArrB = adpe.b();
                                try {
                                    int i9 = inputStream.read(bArrB);
                                    if (i9 <= 0) {
                                        parcelA2.writeInt(0);
                                    } else {
                                        parcelA2.writeInt(i9);
                                        parcelA2.writeByteArray(bArrB, 0, i9);
                                        this.j += i9;
                                        if (i9 == bArrB.length) {
                                            i = 128;
                                        }
                                    }
                                    z = false;
                                    i = 0;
                                } finally {
                                    adpe.a(bArrB);
                                }
                            }
                            if (!z) {
                                inputStream.close();
                                int i10 = this.i;
                                this.i = i10 + 1;
                                if (i10 > 0) {
                                    Queue queue2 = this.c;
                                    queue2.getClass();
                                    queue2.poll();
                                }
                                adzv adzvVar3 = this.f;
                                adzv.g(adzvVar3);
                                adzv.g(adzvVar3);
                                this.j = 0;
                            }
                            i4 = i8 | i;
                        } else {
                            woy.Z(this.g);
                            i4 = iA;
                        }
                        if (!this.g || i()) {
                            iA = i4;
                            adqs.j(adqfVarC.a(), iA);
                            int iDataSize22 = adqfVarC.a().dataSize();
                            this.d.v(this.e, adqfVarC);
                            adzv adzvVar22 = this.f;
                            adzvVar22.c(iDataSize22);
                            adzv.g(adzvVar22);
                            adqfVarC.close();
                        } else {
                            c(3);
                            iA = i4 | 4 | b(adqfVarC.a());
                            c(4);
                            adqs.j(adqfVarC.a(), iA);
                            int iDataSize222 = adqfVarC.a().dataSize();
                            this.d.v(this.e, adqfVarC);
                            adzv adzvVar222 = this.f;
                            adzvVar222.c(iDataSize222);
                            adzv.g(adzvVar222);
                            adqfVarC.close();
                        }
                    } catch (Throwable th) {
                        try {
                            adqfVarC.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    throw new adnr(adnq.l.d(e));
                }
            } catch (adnr e2) {
                c(5);
                throw e2;
            }
        }
    }

    final boolean h() {
        return this.d.y();
    }

    protected final boolean i() {
        Queue queue = this.c;
        return queue != null ? !queue.isEmpty() : this.b != null && this.i == 0;
    }

    public final synchronized String toString() {
        String simpleName;
        int i;
        simpleName = getClass().getSimpleName();
        i = this.k;
        return simpleName + "[S=" + (i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "CLOSED" : "SUFFIX_SENT" : "ALL_MESSAGES_SENT" : "PREFIX_SENT" : "INITIAL") + "/NDM=" + this.i + "]";
    }
}
