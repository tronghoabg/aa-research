package Re;

import java.util.Iterator;
import p7.AbstractC3772b;

/* loaded from: classes5.dex */
public final class E extends Ye.b {

    /* renamed from: a, reason: collision with root package name */
    public Iterator f10644a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f10645b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10646c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10647d;

    /* renamed from: e, reason: collision with root package name */
    public final He.f f10648e;

    public E(He.f fVar, Iterator it, int i5) {
        this.f10647d = i5;
        this.f10644a = it;
        this.f10648e = fVar;
    }

    @Override // Oe.d
    public final int c(int i5) {
        return 1;
    }

    @Override // ug.b
    public final void cancel() {
        this.f10645b = true;
    }

    @Override // Oe.h
    public final void clear() {
        this.f10644a = null;
    }

    @Override // Oe.h
    public final boolean isEmpty() {
        Iterator it = this.f10644a;
        return it == null || !it.hasNext();
    }

    @Override // Oe.h
    public final Object poll() {
        Iterator it = this.f10644a;
        if (it == null) {
            return null;
        }
        if (!this.f10646c) {
            this.f10646c = true;
        } else if (!it.hasNext()) {
            return null;
        }
        Object next = this.f10644a.next();
        Ne.b.a(next, "Iterator.next() returned a null value");
        return next;
    }

    @Override // ug.b
    public final void request(long j8) {
        if (Ye.f.c(j8) && Fe.e.f(this, j8) == 0) {
            if (j8 == Long.MAX_VALUE) {
                switch (this.f10647d) {
                    case 0:
                        Iterator it = this.f10644a;
                        Oe.a aVar = (Oe.a) this.f10648e;
                        while (!this.f10645b) {
                            try {
                                Object next = it.next();
                                if (this.f10645b) {
                                    break;
                                } else if (next == null) {
                                    aVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                                    break;
                                } else {
                                    aVar.d(next);
                                    if (this.f10645b) {
                                        break;
                                    } else {
                                        try {
                                            if (!it.hasNext()) {
                                                if (!this.f10645b) {
                                                    aVar.onComplete();
                                                    break;
                                                }
                                            }
                                        } catch (Throwable th) {
                                            AbstractC3772b.U(th);
                                            aVar.onError(th);
                                            return;
                                        }
                                    }
                                }
                            } catch (Throwable th2) {
                                AbstractC3772b.U(th2);
                                aVar.onError(th2);
                            }
                        }
                        break;
                    default:
                        Iterator it2 = this.f10644a;
                        He.f fVar = this.f10648e;
                        while (!this.f10645b) {
                            try {
                                Object next2 = it2.next();
                                if (this.f10645b) {
                                    break;
                                } else if (next2 == null) {
                                    fVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                                    break;
                                } else {
                                    fVar.b(next2);
                                    if (this.f10645b) {
                                        break;
                                    } else {
                                        try {
                                            if (!it2.hasNext()) {
                                                if (!this.f10645b) {
                                                    fVar.onComplete();
                                                    break;
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            AbstractC3772b.U(th3);
                                            fVar.onError(th3);
                                            return;
                                        }
                                    }
                                }
                            } catch (Throwable th4) {
                                AbstractC3772b.U(th4);
                                fVar.onError(th4);
                                return;
                            }
                        }
                        break;
                }
            }
            switch (this.f10647d) {
                case 0:
                    Iterator it3 = this.f10644a;
                    Oe.a aVar2 = (Oe.a) this.f10648e;
                    do {
                        long j10 = 0;
                        while (true) {
                            if (j10 == j8) {
                                j8 = get();
                                if (j10 == j8) {
                                    j8 = addAndGet(-j10);
                                }
                            } else if (this.f10645b) {
                                break;
                            } else {
                                try {
                                    Object next3 = it3.next();
                                    if (this.f10645b) {
                                        break;
                                    } else if (next3 == null) {
                                        aVar2.onError(new NullPointerException("Iterator.next() returned a null value"));
                                        break;
                                    } else {
                                        boolean zD = aVar2.d(next3);
                                        if (this.f10645b) {
                                            break;
                                        } else {
                                            try {
                                                if (!it3.hasNext()) {
                                                    if (!this.f10645b) {
                                                        aVar2.onComplete();
                                                        break;
                                                    }
                                                } else if (zD) {
                                                    j10++;
                                                }
                                            } catch (Throwable th5) {
                                                AbstractC3772b.U(th5);
                                                aVar2.onError(th5);
                                                return;
                                            }
                                        }
                                    }
                                } catch (Throwable th6) {
                                    AbstractC3772b.U(th6);
                                    aVar2.onError(th6);
                                    return;
                                }
                            }
                        }
                    } while (j8 != 0);
                    break;
                default:
                    Iterator it4 = this.f10644a;
                    He.f fVar2 = this.f10648e;
                    do {
                        long j11 = 0;
                        while (true) {
                            if (j11 == j8) {
                                j8 = get();
                                if (j11 == j8) {
                                    j8 = addAndGet(-j11);
                                }
                            } else if (this.f10645b) {
                                break;
                            } else {
                                try {
                                    Object next4 = it4.next();
                                    if (this.f10645b) {
                                        break;
                                    } else if (next4 == null) {
                                        fVar2.onError(new NullPointerException("Iterator.next() returned a null value"));
                                        break;
                                    } else {
                                        fVar2.b(next4);
                                        if (this.f10645b) {
                                            break;
                                        } else {
                                            try {
                                                if (!it4.hasNext()) {
                                                    if (!this.f10645b) {
                                                        fVar2.onComplete();
                                                        break;
                                                    }
                                                } else {
                                                    j11++;
                                                }
                                            } catch (Throwable th7) {
                                                AbstractC3772b.U(th7);
                                                fVar2.onError(th7);
                                                return;
                                            }
                                        }
                                    }
                                } catch (Throwable th8) {
                                    AbstractC3772b.U(th8);
                                    fVar2.onError(th8);
                                    return;
                                }
                            }
                        }
                    } while (j8 != 0);
                    break;
            }
        }
    }
}
