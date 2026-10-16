package e.a.b.a;

import android.os.Parcel;
import e.a.d.jt;
import e.a.ee;
import e.a.ef;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
abstract class aj {

    /* renamed from: a, reason: collision with root package name */
    private final k f46320a;

    /* renamed from: b, reason: collision with root package name */
    private final int f46321b;

    /* renamed from: c, reason: collision with root package name */
    private final jt f46322c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f46323d;

    /* renamed from: e, reason: collision with root package name */
    private InputStream f46324e;

    /* renamed from: f, reason: collision with root package name */
    private Queue f46325f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f46326g;

    /* renamed from: h, reason: collision with root package name */
    private int f46327h;

    /* renamed from: i, reason: collision with root package name */
    private int f46328i;

    /* renamed from: j, reason: collision with root package name */
    private int f46329j;

    /* renamed from: k, reason: collision with root package name */
    private int f46330k = 1;

    /* synthetic */ aj(k kVar, int i2, jt jtVar) {
        this.f46320a = kVar;
        this.f46321b = i2;
        this.f46322c = jtVar;
    }

    private final void b(int i2) {
        int i3 = this.f46330k;
        int i4 = i2 - 1;
        if (i4 == 1) {
            com.google.d.b.an.u(i3 == 1);
        } else if (i4 == 2) {
            com.google.d.b.an.u(i3 == 2);
        } else if (i4 == 3) {
            com.google.d.b.an.u(i3 == 3);
        }
        this.f46330k = i2;
    }

    protected abstract int a(Parcel parcel);

    final jt c() {
        return this.f46322c;
    }

    final void d(InputStream inputStream) {
        e();
        Queue queue = this.f46325f;
        if (queue != null) {
            queue.add(inputStream);
        } else {
            if (this.f46324e == null) {
                this.f46324e = inputStream;
                return;
            }
            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
            this.f46325f = concurrentLinkedQueue;
            concurrentLinkedQueue.add(inputStream);
        }
    }

    protected final void e() {
        this.f46323d = true;
    }

    protected final void f() {
        this.f46326g = true;
    }

    final void g() throws ef {
        int iA;
        int i2;
        while (true) {
            int i3 = this.f46330k;
            int i4 = i3 - 1;
            InputStream inputStream = null;
            if (i3 == 0) {
                throw null;
            }
            boolean z = true;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2 || !this.f46326g) {
                        return;
                    }
                } else if (!i() && !this.f46326g) {
                    return;
                }
            } else if (!this.f46323d) {
                return;
            }
            if (!h()) {
                return;
            }
            try {
                try {
                    ak akVarC = ak.c();
                    try {
                        int i5 = 0;
                        akVarC.a().writeInt(0);
                        Parcel parcelA = akVarC.a();
                        int i6 = this.f46327h;
                        this.f46327h = i6 + 1;
                        parcelA.writeInt(i6);
                        int i7 = this.f46330k;
                        int i8 = i7 - 1;
                        if (i7 == 0) {
                            throw null;
                        }
                        if (i8 == 0) {
                            iA = a(akVarC.a()) | 1;
                            b(2);
                            if (i() || this.f46326g) {
                            }
                            at.b(akVarC.a(), iA);
                            int iDataSize = akVarC.a().dataSize();
                            this.f46320a.A(this.f46321b, akVarC);
                            jt jtVar = this.f46322c;
                            jtVar.b(iDataSize);
                            jtVar.l();
                            akVarC.close();
                        } else if (i8 == 1) {
                            iA = 0;
                        } else {
                            if (i8 != 2) {
                                throw new AssertionError();
                            }
                            akVarC.a();
                            iA = i5 | 4;
                            b(4);
                            at.b(akVarC.a(), iA);
                            int iDataSize2 = akVarC.a().dataSize();
                            this.f46320a.A(this.f46321b, akVarC);
                            jt jtVar2 = this.f46322c;
                            jtVar2.b(iDataSize2);
                            jtVar2.l();
                            akVarC.close();
                        }
                        if (this.f46328i == 0) {
                            inputStream = this.f46324e;
                        } else {
                            Queue queue = this.f46325f;
                            if (queue != null) {
                                inputStream = (InputStream) queue.peek();
                            }
                        }
                        if (inputStream != null) {
                            int i9 = iA | 2;
                            Parcel parcelA2 = akVarC.a();
                            if (inputStream instanceof al) {
                                this.f46329j = ((al) inputStream).a(parcelA2);
                                i2 = 64;
                                z = false;
                            } else {
                                byte[] bArrB = m.b();
                                try {
                                    int i10 = inputStream.read(bArrB);
                                    if (i10 <= 0) {
                                        parcelA2.writeInt(0);
                                    } else {
                                        parcelA2.writeInt(i10);
                                        parcelA2.writeByteArray(bArrB, 0, i10);
                                        this.f46329j += i10;
                                        if (i10 == bArrB.length) {
                                            i2 = 128;
                                        }
                                    }
                                    z = false;
                                    i2 = 0;
                                } finally {
                                    m.a(bArrB);
                                }
                            }
                            if (!z) {
                                inputStream.close();
                                int i11 = this.f46328i;
                                this.f46328i = i11 + 1;
                                if (i11 > 0) {
                                    Queue queue2 = this.f46325f;
                                    com.google.d.b.an.B(queue2);
                                    queue2.poll();
                                }
                                jt jtVar3 = this.f46322c;
                                jtVar3.j();
                                jtVar3.k();
                                this.f46329j = 0;
                            }
                            i5 = i9 | i2;
                        } else {
                            com.google.d.b.an.u(this.f46326g);
                            i5 = iA;
                        }
                        if (!this.f46326g || i()) {
                            iA = i5;
                            at.b(akVarC.a(), iA);
                            int iDataSize22 = akVarC.a().dataSize();
                            this.f46320a.A(this.f46321b, akVarC);
                            jt jtVar22 = this.f46322c;
                            jtVar22.b(iDataSize22);
                            jtVar22.l();
                            akVarC.close();
                        } else {
                            b(3);
                            akVarC.a();
                            iA = i5 | 4;
                            b(4);
                            at.b(akVarC.a(), iA);
                            int iDataSize222 = akVarC.a().dataSize();
                            this.f46320a.A(this.f46321b, akVarC);
                            jt jtVar222 = this.f46322c;
                            jtVar222.b(iDataSize222);
                            jtVar222.l();
                            akVarC.close();
                        }
                    } catch (Throwable th) {
                        try {
                            akVarC.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (ef e2) {
                    b(5);
                    throw e2;
                }
            } catch (IOException e3) {
                throw new ef(ee.f47410j.f(e3));
            }
        }
    }

    final boolean h() {
        return this.f46320a.E();
    }

    protected final boolean i() {
        Queue queue = this.f46325f;
        return queue != null ? !queue.isEmpty() : this.f46324e != null && this.f46328i == 0;
    }

    public final synchronized String toString() {
        String simpleName;
        int i2;
        simpleName = getClass().getSimpleName();
        i2 = this.f46330k;
        return simpleName + "[S=" + (i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "null" : "CLOSED" : "SUFFIX_SENT" : "ALL_MESSAGES_SENT" : "PREFIX_SENT" : "INITIAL") + "/NDM=" + this.f46328i + "]";
    }
}
