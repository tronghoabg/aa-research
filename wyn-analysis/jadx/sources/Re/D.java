package Re;

/* loaded from: classes5.dex */
public final class D extends Ye.b {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f10639a;

    /* renamed from: b, reason: collision with root package name */
    public int f10640b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f10641c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10642d;

    /* renamed from: e, reason: collision with root package name */
    public final He.f f10643e;

    public D(He.f fVar, Object[] objArr, int i5) {
        this.f10642d = i5;
        this.f10639a = objArr;
        this.f10643e = fVar;
    }

    @Override // Oe.d
    public final int c(int i5) {
        return 1;
    }

    @Override // ug.b
    public final void cancel() {
        this.f10641c = true;
    }

    @Override // Oe.h
    public final void clear() {
        this.f10640b = this.f10639a.length;
    }

    @Override // Oe.h
    public final boolean isEmpty() {
        return this.f10640b == this.f10639a.length;
    }

    @Override // Oe.h
    public final Object poll() {
        int i5 = this.f10640b;
        Object[] objArr = this.f10639a;
        if (i5 == objArr.length) {
            return null;
        }
        this.f10640b = i5 + 1;
        Object obj = objArr[i5];
        Ne.b.a(obj, "array element is null");
        return obj;
    }

    @Override // ug.b
    public final void request(long j8) {
        if (Ye.f.c(j8) && Fe.e.f(this, j8) == 0) {
            if (j8 == Long.MAX_VALUE) {
                switch (this.f10642d) {
                    case 0:
                        Object[] objArr = this.f10639a;
                        int length = objArr.length;
                        Oe.a aVar = (Oe.a) this.f10643e;
                        for (int i5 = this.f10640b; i5 != length; i5++) {
                            if (this.f10641c) {
                                break;
                            } else {
                                Object obj = objArr[i5];
                                if (obj == null) {
                                    aVar.onError(new NullPointerException("array element is null"));
                                    break;
                                } else {
                                    aVar.d(obj);
                                }
                            }
                        }
                        if (!this.f10641c) {
                            aVar.onComplete();
                            break;
                        }
                        break;
                    default:
                        Object[] objArr2 = this.f10639a;
                        int length2 = objArr2.length;
                        He.f fVar = this.f10643e;
                        for (int i10 = this.f10640b; i10 != length2; i10++) {
                            if (this.f10641c) {
                                break;
                            } else {
                                Object obj2 = objArr2[i10];
                                if (obj2 == null) {
                                    fVar.onError(new NullPointerException("array element is null"));
                                    break;
                                } else {
                                    fVar.b(obj2);
                                }
                            }
                        }
                        if (!this.f10641c) {
                            fVar.onComplete();
                            break;
                        }
                        break;
                }
            }
            switch (this.f10642d) {
                case 0:
                    Object[] objArr3 = this.f10639a;
                    int length3 = objArr3.length;
                    int i11 = this.f10640b;
                    Oe.a aVar2 = (Oe.a) this.f10643e;
                    do {
                        long j10 = 0;
                        while (true) {
                            if (j10 == j8 || i11 == length3) {
                                if (i11 == length3) {
                                    if (!this.f10641c) {
                                        aVar2.onComplete();
                                        break;
                                    }
                                } else {
                                    j8 = get();
                                    if (j10 == j8) {
                                        this.f10640b = i11;
                                        j8 = addAndGet(-j10);
                                    }
                                }
                            } else if (this.f10641c) {
                                break;
                            } else {
                                Object obj3 = objArr3[i11];
                                if (obj3 == null) {
                                    aVar2.onError(new NullPointerException("array element is null"));
                                    break;
                                } else {
                                    if (aVar2.d(obj3)) {
                                        j10++;
                                    }
                                    i11++;
                                }
                            }
                        }
                    } while (j8 != 0);
                    break;
                default:
                    Object[] objArr4 = this.f10639a;
                    int length4 = objArr4.length;
                    int i12 = this.f10640b;
                    He.f fVar2 = this.f10643e;
                    do {
                        long j11 = 0;
                        while (true) {
                            if (j11 == j8 || i12 == length4) {
                                if (i12 == length4) {
                                    if (!this.f10641c) {
                                        fVar2.onComplete();
                                        break;
                                    }
                                } else {
                                    j8 = get();
                                    if (j11 == j8) {
                                        this.f10640b = i12;
                                        j8 = addAndGet(-j11);
                                    }
                                }
                            } else if (this.f10641c) {
                                break;
                            } else {
                                Object obj4 = objArr4[i12];
                                if (obj4 == null) {
                                    fVar2.onError(new NullPointerException("array element is null"));
                                    break;
                                } else {
                                    fVar2.b(obj4);
                                    j11++;
                                    i12++;
                                }
                            }
                        }
                    } while (j8 != 0);
                    break;
            }
        }
    }
}
