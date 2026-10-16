package com.google.v;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class aa {

    /* renamed from: a, reason: collision with root package name */
    private final z f12632a;

    /* renamed from: b, reason: collision with root package name */
    private int f12633b;

    /* renamed from: c, reason: collision with root package name */
    private int f12634c;

    /* renamed from: d, reason: collision with root package name */
    private int f12635d = 0;

    private aa(z zVar) {
        zVar.getClass();
        this.f12632a = zVar;
        zVar.f13074e = this;
    }

    private final Object S(gm gmVar, Class cls, de deVar) {
        gm gmVar2 = gm.DOUBLE;
        switch (gmVar) {
            case DOUBLE:
                return Double.valueOf(a());
            case FLOAT:
                return Float.valueOf(b());
            case INT64:
                return Long.valueOf(l());
            case UINT64:
                return Long.valueOf(o());
            case INT32:
                return Integer.valueOf(g());
            case FIXED64:
                return Long.valueOf(k());
            case FIXED32:
                return Integer.valueOf(f());
            case BOOL:
                return Boolean.valueOf(Q());
            case STRING:
                return u();
            case GROUP:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case MESSAGE:
                return s(cls, deVar);
            case BYTES:
                return p();
            case UINT32:
                return Integer.valueOf(j());
            case ENUM:
                return Integer.valueOf(e());
            case SFIXED32:
                return Integer.valueOf(h());
            case SFIXED64:
                return Long.valueOf(m());
            case SINT32:
                return Integer.valueOf(i());
            case SINT64:
                return Long.valueOf(n());
        }
    }

    private final Object T(ft ftVar, de deVar) throws eu {
        Object objE = ftVar.e();
        V(objE, ftVar, deVar);
        ftVar.f(objE);
        return objE;
    }

    private final Object U(ft ftVar, de deVar) throws eu {
        Object objE = ftVar.e();
        W(objE, ftVar, deVar);
        ftVar.f(objE);
        return objE;
    }

    private final void V(Object obj, ft ftVar, de deVar) throws eu {
        z zVar = this.f12632a;
        zVar.U();
        int i2 = this.f12634c;
        this.f12634c = go.c(go.a(this.f12633b), 4);
        zVar.f13071b++;
        try {
            ftVar.h(obj, this, deVar);
            if (this.f12633b == this.f12634c) {
            } else {
                throw new eu("Failed to parse the message.");
            }
        } finally {
            z zVar2 = this.f12632a;
            zVar2.f13071b--;
            this.f12634c = i2;
        }
    }

    private final void W(Object obj, ft ftVar, de deVar) throws eu {
        z zVar = this.f12632a;
        int iR = zVar.r();
        zVar.U();
        int iF = zVar.f(iR);
        zVar.f13070a++;
        ftVar.h(obj, this, deVar);
        zVar.E(0);
        zVar.f13070a--;
        zVar.F(iF);
    }

    private final void X(int i2) throws eu {
        if (this.f12632a.e() != i2) {
            throw new eu("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final void Y(int i2) throws et {
        if (go.b(this.f12633b) != i2) {
            throw new et();
        }
    }

    private static final void Z(int i2) throws eu {
        if ((i2 & 3) != 0) {
            throw new eu("Failed to parse the message.");
        }
    }

    private static final void aa(int i2) throws eu {
        if ((i2 & 7) != 0) {
            throw new eu("Failed to parse the message.");
        }
    }

    public static aa q(z zVar) {
        Object obj = zVar.f13074e;
        return obj != null ? (aa) obj : new aa(zVar);
    }

    public final void A(List list) throws eu {
        int iQ;
        int iQ2;
        if (list instanceof ed) {
            ed edVar = (ed) list;
            int iB = go.b(this.f12633b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new et();
                }
                z zVar = this.f12632a;
                int iE = zVar.e() + zVar.r();
                do {
                    edVar.i(zVar.g());
                } while (zVar.e() < iE);
                X(iE);
                return;
            }
            do {
                z zVar2 = this.f12632a;
                edVar.i(zVar2.g());
                if (zVar2.J()) {
                    return;
                } else {
                    iQ2 = zVar2.q();
                }
            } while (iQ2 == this.f12633b);
        } else {
            int iB2 = go.b(this.f12633b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new et();
                }
                z zVar3 = this.f12632a;
                int iE2 = zVar3.e() + zVar3.r();
                do {
                    list.add(Integer.valueOf(zVar3.g()));
                } while (zVar3.e() < iE2);
                X(iE2);
                return;
            }
            do {
                z zVar4 = this.f12632a;
                list.add(Integer.valueOf(zVar4.g()));
                if (zVar4.J()) {
                    return;
                } else {
                    iQ = zVar4.q();
                }
            } while (iQ == this.f12633b);
            iQ2 = iQ;
        }
        this.f12635d = iQ2;
    }

    public final void B(List list) throws eu {
        int iQ;
        int iQ2;
        if (list instanceof ed) {
            ed edVar = (ed) list;
            int iB = go.b(this.f12633b);
            if (iB == 2) {
                z zVar = this.f12632a;
                int iR = zVar.r();
                Z(iR);
                int iE = zVar.e() + iR;
                do {
                    edVar.i(zVar.h());
                } while (zVar.e() < iE);
                return;
            }
            if (iB != 5) {
                throw new et();
            }
            do {
                z zVar2 = this.f12632a;
                edVar.i(zVar2.h());
                if (zVar2.J()) {
                    return;
                } else {
                    iQ2 = zVar2.q();
                }
            } while (iQ2 == this.f12633b);
        } else {
            int iB2 = go.b(this.f12633b);
            if (iB2 == 2) {
                z zVar3 = this.f12632a;
                int iR2 = zVar3.r();
                Z(iR2);
                int iE2 = zVar3.e() + iR2;
                do {
                    list.add(Integer.valueOf(zVar3.h()));
                } while (zVar3.e() < iE2);
                return;
            }
            if (iB2 != 5) {
                throw new et();
            }
            do {
                z zVar4 = this.f12632a;
                list.add(Integer.valueOf(zVar4.h()));
                if (zVar4.J()) {
                    return;
                } else {
                    iQ = zVar4.q();
                }
            } while (iQ == this.f12633b);
            iQ2 = iQ;
        }
        this.f12635d = iQ2;
    }

    public final void C(List list) throws eu {
        int iQ;
        int iQ2;
        if (list instanceof fc) {
            fc fcVar = (fc) list;
            int iB = go.b(this.f12633b);
            if (iB != 1) {
                if (iB != 2) {
                    throw new et();
                }
                z zVar = this.f12632a;
                int iR = zVar.r();
                aa(iR);
                int iE = zVar.e() + iR;
                do {
                    fcVar.g(zVar.t());
                } while (zVar.e() < iE);
                return;
            }
            do {
                z zVar2 = this.f12632a;
                fcVar.g(zVar2.t());
                if (zVar2.J()) {
                    return;
                } else {
                    iQ2 = zVar2.q();
                }
            } while (iQ2 == this.f12633b);
        } else {
            int iB2 = go.b(this.f12633b);
            if (iB2 != 1) {
                if (iB2 != 2) {
                    throw new et();
                }
                z zVar3 = this.f12632a;
                int iR2 = zVar3.r();
                aa(iR2);
                int iE2 = zVar3.e() + iR2;
                do {
                    list.add(Long.valueOf(zVar3.t()));
                } while (zVar3.e() < iE2);
                return;
            }
            do {
                z zVar4 = this.f12632a;
                list.add(Long.valueOf(zVar4.t()));
                if (zVar4.J()) {
                    return;
                } else {
                    iQ = zVar4.q();
                }
            } while (iQ == this.f12633b);
            iQ2 = iQ;
        }
        this.f12635d = iQ2;
    }

    public final void D(List list) throws eu {
        int iQ;
        int iQ2;
        if (list instanceof dj) {
            dj djVar = (dj) list;
            int iB = go.b(this.f12633b);
            if (iB == 2) {
                z zVar = this.f12632a;
                int iR = zVar.r();
                Z(iR);
                int iE = zVar.e() + iR;
                do {
                    djVar.i(zVar.c());
                } while (zVar.e() < iE);
                return;
            }
            if (iB != 5) {
                throw new et();
            }
            do {
                z zVar2 = this.f12632a;
                djVar.i(zVar2.c());
                if (zVar2.J()) {
                    return;
                } else {
                    iQ2 = zVar2.q();
                }
            } while (iQ2 == this.f12633b);
        } else {
            int iB2 = go.b(this.f12633b);
            if (iB2 == 2) {
                z zVar3 = this.f12632a;
                int iR2 = zVar3.r();
                Z(iR2);
                int iE2 = zVar3.e() + iR2;
                do {
                    list.add(Float.valueOf(zVar3.c()));
                } while (zVar3.e() < iE2);
                return;
            }
            if (iB2 != 5) {
                throw new et();
            }
            do {
                z zVar4 = this.f12632a;
                list.add(Float.valueOf(zVar4.c()));
                if (zVar4.J()) {
                    return;
                } else {
                    iQ = zVar4.q();
                }
            } while (iQ == this.f12633b);
            iQ2 = iQ;
        }
        this.f12635d = iQ2;
    }

    @Deprecated
    public final void E(List list, ft ftVar, de deVar) throws et {
        int iQ;
        int i2 = this.f12633b;
        if (go.b(i2) != 3) {
            throw new et();
        }
        do {
            list.add(T(ftVar, deVar));
            z zVar = this.f12632a;
            if (zVar.J() || this.f12635d != 0) {
                return;
            } else {
                iQ = zVar.q();
            }
        } while (iQ == i2);
        this.f12635d = iQ;
    }

    public final void F(List list) throws eu {
        int iQ;
        int iQ2;
        if (list instanceof ed) {
            ed edVar = (ed) list;
            int iB = go.b(this.f12633b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new et();
                }
                z zVar = this.f12632a;
                int iE = zVar.e() + zVar.r();
                do {
                    edVar.i(zVar.i());
                } while (zVar.e() < iE);
                X(iE);
                return;
            }
            do {
                z zVar2 = this.f12632a;
                edVar.i(zVar2.i());
                if (zVar2.J()) {
                    return;
                } else {
                    iQ2 = zVar2.q();
                }
            } while (iQ2 == this.f12633b);
        } else {
            int iB2 = go.b(this.f12633b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new et();
                }
                z zVar3 = this.f12632a;
                int iE2 = zVar3.e() + zVar3.r();
                do {
                    list.add(Integer.valueOf(zVar3.i()));
                } while (zVar3.e() < iE2);
                X(iE2);
                return;
            }
            do {
                z zVar4 = this.f12632a;
                list.add(Integer.valueOf(zVar4.i()));
                if (zVar4.J()) {
                    return;
                } else {
                    iQ = zVar4.q();
                }
            } while (iQ == this.f12633b);
            iQ2 = iQ;
        }
        this.f12635d = iQ2;
    }

    public final void G(List list) throws eu {
        int iQ;
        int iQ2;
        if (list instanceof fc) {
            fc fcVar = (fc) list;
            int iB = go.b(this.f12633b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new et();
                }
                z zVar = this.f12632a;
                int iE = zVar.e() + zVar.r();
                do {
                    fcVar.g(zVar.u());
                } while (zVar.e() < iE);
                X(iE);
                return;
            }
            do {
                z zVar2 = this.f12632a;
                fcVar.g(zVar2.u());
                if (zVar2.J()) {
                    return;
                } else {
                    iQ2 = zVar2.q();
                }
            } while (iQ2 == this.f12633b);
        } else {
            int iB2 = go.b(this.f12633b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new et();
                }
                z zVar3 = this.f12632a;
                int iE2 = zVar3.e() + zVar3.r();
                do {
                    list.add(Long.valueOf(zVar3.u()));
                } while (zVar3.e() < iE2);
                X(iE2);
                return;
            }
            do {
                z zVar4 = this.f12632a;
                list.add(Long.valueOf(zVar4.u()));
                if (zVar4.J()) {
                    return;
                } else {
                    iQ = zVar4.q();
                }
            } while (iQ == this.f12633b);
            iQ2 = iQ;
        }
        this.f12635d = iQ2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        r10.put(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(java.util.Map r10, com.google.v.fd r11, com.google.v.de r12) throws com.google.v.et {
        /*
            r9 = this;
            r0 = 2
            r9.Y(r0)
            com.google.v.z r1 = r9.f12632a
            int r2 = r1.r()
            int r2 = r1.f(r2)
            java.lang.Object r3 = r11.f12952d
            java.lang.Object r4 = r11.f12950b
            r5 = r3
        L13:
            int r6 = r9.c()     // Catch: java.lang.Throwable -> L61
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r7) goto L58
            boolean r7 = r1.J()     // Catch: java.lang.Throwable -> L61
            if (r7 == 0) goto L23
            goto L58
        L23:
            r7 = 1
            r8 = 0
            if (r6 == r7) goto L43
            if (r6 == r0) goto L38
            boolean r6 = r9.R()     // Catch: com.google.v.et -> L4a java.lang.Throwable -> L61
            if (r6 == 0) goto L30
            goto L13
        L30:
            com.google.v.eu r6 = new com.google.v.eu     // Catch: com.google.v.et -> L4a java.lang.Throwable -> L61
            java.lang.String r7 = "Unable to parse map entry."
            r6.<init>(r7)     // Catch: com.google.v.et -> L4a java.lang.Throwable -> L61
            throw r6     // Catch: com.google.v.et -> L4a java.lang.Throwable -> L61
        L38:
            com.google.v.gm r6 = r11.f12951c     // Catch: com.google.v.et -> L4a java.lang.Throwable -> L61
            java.lang.Class r7 = r3.getClass()     // Catch: com.google.v.et -> L4a java.lang.Throwable -> L61
            java.lang.Object r5 = r9.S(r6, r7, r12)     // Catch: com.google.v.et -> L4a java.lang.Throwable -> L61
            goto L13
        L43:
            com.google.v.gm r6 = r11.f12949a     // Catch: com.google.v.et -> L4a java.lang.Throwable -> L61
            java.lang.Object r4 = r9.S(r6, r8, r8)     // Catch: com.google.v.et -> L4a java.lang.Throwable -> L61
            goto L13
        L4a:
            r6 = move-exception
            boolean r7 = r9.R()     // Catch: java.lang.Throwable -> L61
            if (r7 == 0) goto L52
            goto L13
        L52:
            com.google.v.eu r10 = new com.google.v.eu     // Catch: java.lang.Throwable -> L61
            r10.<init>(r6, r8)     // Catch: java.lang.Throwable -> L61
            throw r10     // Catch: java.lang.Throwable -> L61
        L58:
            r10.put(r4, r5)     // Catch: java.lang.Throwable -> L61
            com.google.v.z r9 = r9.f12632a
            r9.F(r2)
            return
        L61:
            r10 = move-exception
            com.google.v.z r9 = r9.f12632a
            r9.F(r2)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.v.aa.H(java.util.Map, com.google.v.fd, com.google.v.de):void");
    }

    public final void I(List list, ft ftVar, de deVar) throws et {
        int iQ;
        int i2 = this.f12633b;
        if (go.b(i2) != 2) {
            throw new et();
        }
        do {
            list.add(U(ftVar, deVar));
            z zVar = this.f12632a;
            if (zVar.J() || this.f12635d != 0) {
                return;
            } else {
                iQ = zVar.q();
            }
        } while (iQ == i2);
        this.f12635d = iQ;
    }

    public final void J(List list) throws eu {
        int iQ;
        int iQ2;
        if (list instanceof ed) {
            ed edVar = (ed) list;
            int iB = go.b(this.f12633b);
            if (iB == 2) {
                z zVar = this.f12632a;
                int iR = zVar.r();
                Z(iR);
                int iE = zVar.e() + iR;
                do {
                    edVar.i(zVar.o());
                } while (zVar.e() < iE);
                return;
            }
            if (iB != 5) {
                throw new et();
            }
            do {
                z zVar2 = this.f12632a;
                edVar.i(zVar2.o());
                if (zVar2.J()) {
                    return;
                } else {
                    iQ2 = zVar2.q();
                }
            } while (iQ2 == this.f12633b);
        } else {
            int iB2 = go.b(this.f12633b);
            if (iB2 == 2) {
                z zVar3 = this.f12632a;
                int iR2 = zVar3.r();
                Z(iR2);
                int iE2 = zVar3.e() + iR2;
                do {
                    list.add(Integer.valueOf(zVar3.o()));
                } while (zVar3.e() < iE2);
                return;
            }
            if (iB2 != 5) {
                throw new et();
            }
            do {
                z zVar4 = this.f12632a;
                list.add(Integer.valueOf(zVar4.o()));
                if (zVar4.J()) {
                    return;
                } else {
                    iQ = zVar4.q();
                }
            } while (iQ == this.f12633b);
            iQ2 = iQ;
        }
        this.f12635d = iQ2;
    }

    public final void K(List list) throws eu {
        int iQ;
        int iQ2;
        if (list instanceof fc) {
            fc fcVar = (fc) list;
            int iB = go.b(this.f12633b);
            if (iB != 1) {
                if (iB != 2) {
                    throw new et();
                }
                z zVar = this.f12632a;
                int iR = zVar.r();
                aa(iR);
                int iE = zVar.e() + iR;
                do {
                    fcVar.g(zVar.y());
                } while (zVar.e() < iE);
                return;
            }
            do {
                z zVar2 = this.f12632a;
                fcVar.g(zVar2.y());
                if (zVar2.J()) {
                    return;
                } else {
                    iQ2 = zVar2.q();
                }
            } while (iQ2 == this.f12633b);
        } else {
            int iB2 = go.b(this.f12633b);
            if (iB2 != 1) {
                if (iB2 != 2) {
                    throw new et();
                }
                z zVar3 = this.f12632a;
                int iR2 = zVar3.r();
                aa(iR2);
                int iE2 = zVar3.e() + iR2;
                do {
                    list.add(Long.valueOf(zVar3.y()));
                } while (zVar3.e() < iE2);
                return;
            }
            do {
                z zVar4 = this.f12632a;
                list.add(Long.valueOf(zVar4.y()));
                if (zVar4.J()) {
                    return;
                } else {
                    iQ = zVar4.q();
                }
            } while (iQ == this.f12633b);
            iQ2 = iQ;
        }
        this.f12635d = iQ2;
    }

    public final void L(List list) throws eu {
        int iQ;
        int iQ2;
        if (list instanceof ed) {
            ed edVar = (ed) list;
            int iB = go.b(this.f12633b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new et();
                }
                z zVar = this.f12632a;
                int iE = zVar.e() + zVar.r();
                do {
                    edVar.i(zVar.p());
                } while (zVar.e() < iE);
                X(iE);
                return;
            }
            do {
                z zVar2 = this.f12632a;
                edVar.i(zVar2.p());
                if (zVar2.J()) {
                    return;
                } else {
                    iQ2 = zVar2.q();
                }
            } while (iQ2 == this.f12633b);
        } else {
            int iB2 = go.b(this.f12633b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new et();
                }
                z zVar3 = this.f12632a;
                int iE2 = zVar3.e() + zVar3.r();
                do {
                    list.add(Integer.valueOf(zVar3.p()));
                } while (zVar3.e() < iE2);
                X(iE2);
                return;
            }
            do {
                z zVar4 = this.f12632a;
                list.add(Integer.valueOf(zVar4.p()));
                if (zVar4.J()) {
                    return;
                } else {
                    iQ = zVar4.q();
                }
            } while (iQ == this.f12633b);
            iQ2 = iQ;
        }
        this.f12635d = iQ2;
    }

    public final void M(List list) throws eu {
        int iQ;
        int iQ2;
        if (list instanceof fc) {
            fc fcVar = (fc) list;
            int iB = go.b(this.f12633b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new et();
                }
                z zVar = this.f12632a;
                int iE = zVar.e() + zVar.r();
                do {
                    fcVar.g(zVar.z());
                } while (zVar.e() < iE);
                X(iE);
                return;
            }
            do {
                z zVar2 = this.f12632a;
                fcVar.g(zVar2.z());
                if (zVar2.J()) {
                    return;
                } else {
                    iQ2 = zVar2.q();
                }
            } while (iQ2 == this.f12633b);
        } else {
            int iB2 = go.b(this.f12633b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new et();
                }
                z zVar3 = this.f12632a;
                int iE2 = zVar3.e() + zVar3.r();
                do {
                    list.add(Long.valueOf(zVar3.z()));
                } while (zVar3.e() < iE2);
                X(iE2);
                return;
            }
            do {
                z zVar4 = this.f12632a;
                list.add(Long.valueOf(zVar4.z()));
                if (zVar4.J()) {
                    return;
                } else {
                    iQ = zVar4.q();
                }
            } while (iQ == this.f12633b);
            iQ2 = iQ;
        }
        this.f12635d = iQ2;
    }

    public final void N(List list, boolean z) throws et {
        int iQ;
        int iQ2;
        if (go.b(this.f12633b) != 2) {
            throw new et();
        }
        if ((list instanceof fb) && !z) {
            fb fbVar = (fb) list;
            do {
                p();
                fbVar.b();
                z zVar = this.f12632a;
                if (zVar.J()) {
                    return;
                } else {
                    iQ2 = zVar.q();
                }
            } while (iQ2 == this.f12633b);
        } else {
            do {
                list.add(z ? u() : t());
                z zVar2 = this.f12632a;
                if (zVar2.J()) {
                    return;
                } else {
                    iQ = zVar2.q();
                }
            } while (iQ == this.f12633b);
            iQ2 = iQ;
        }
        this.f12635d = iQ2;
    }

    public final void O(List list) throws eu {
        int iQ;
        int iQ2;
        if (list instanceof ed) {
            ed edVar = (ed) list;
            int iB = go.b(this.f12633b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new et();
                }
                z zVar = this.f12632a;
                int iE = zVar.e() + zVar.r();
                do {
                    edVar.i(zVar.r());
                } while (zVar.e() < iE);
                X(iE);
                return;
            }
            do {
                z zVar2 = this.f12632a;
                edVar.i(zVar2.r());
                if (zVar2.J()) {
                    return;
                } else {
                    iQ2 = zVar2.q();
                }
            } while (iQ2 == this.f12633b);
        } else {
            int iB2 = go.b(this.f12633b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new et();
                }
                z zVar3 = this.f12632a;
                int iE2 = zVar3.e() + zVar3.r();
                do {
                    list.add(Integer.valueOf(zVar3.r()));
                } while (zVar3.e() < iE2);
                X(iE2);
                return;
            }
            do {
                z zVar4 = this.f12632a;
                list.add(Integer.valueOf(zVar4.r()));
                if (zVar4.J()) {
                    return;
                } else {
                    iQ = zVar4.q();
                }
            } while (iQ == this.f12633b);
            iQ2 = iQ;
        }
        this.f12635d = iQ2;
    }

    public final void P(List list) throws eu {
        int iQ;
        int iQ2;
        if (list instanceof fc) {
            fc fcVar = (fc) list;
            int iB = go.b(this.f12633b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new et();
                }
                z zVar = this.f12632a;
                int iE = zVar.e() + zVar.r();
                do {
                    fcVar.g(zVar.A());
                } while (zVar.e() < iE);
                X(iE);
                return;
            }
            do {
                z zVar2 = this.f12632a;
                fcVar.g(zVar2.A());
                if (zVar2.J()) {
                    return;
                } else {
                    iQ2 = zVar2.q();
                }
            } while (iQ2 == this.f12633b);
        } else {
            int iB2 = go.b(this.f12633b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new et();
                }
                z zVar3 = this.f12632a;
                int iE2 = zVar3.e() + zVar3.r();
                do {
                    list.add(Long.valueOf(zVar3.A()));
                } while (zVar3.e() < iE2);
                X(iE2);
                return;
            }
            do {
                z zVar4 = this.f12632a;
                list.add(Long.valueOf(zVar4.A()));
                if (zVar4.J()) {
                    return;
                } else {
                    iQ = zVar4.q();
                }
            } while (iQ == this.f12633b);
            iQ2 = iQ;
        }
        this.f12635d = iQ2;
    }

    public final boolean Q() throws et {
        Y(0);
        return this.f12632a.K();
    }

    public final boolean R() {
        int i2;
        z zVar = this.f12632a;
        if (zVar.J() || (i2 = this.f12633b) == this.f12634c) {
            return false;
        }
        return zVar.L(i2);
    }

    public final double a() throws et {
        Y(1);
        return this.f12632a.b();
    }

    public final float b() throws et {
        Y(5);
        return this.f12632a.c();
    }

    public final int c() {
        int iQ = this.f12635d;
        if (iQ != 0) {
            this.f12633b = iQ;
            this.f12635d = 0;
        } else {
            iQ = this.f12632a.q();
            this.f12633b = iQ;
        }
        if (iQ == 0 || iQ == this.f12634c) {
            return Integer.MAX_VALUE;
        }
        return go.a(iQ);
    }

    public final int d() {
        return this.f12633b;
    }

    public final int e() throws et {
        Y(0);
        return this.f12632a.g();
    }

    public final int f() throws et {
        Y(5);
        return this.f12632a.h();
    }

    public final int g() throws et {
        Y(0);
        return this.f12632a.i();
    }

    public final int h() throws et {
        Y(5);
        return this.f12632a.o();
    }

    public final int i() throws et {
        Y(0);
        return this.f12632a.p();
    }

    public final int j() throws et {
        Y(0);
        return this.f12632a.r();
    }

    public final long k() throws et {
        Y(1);
        return this.f12632a.t();
    }

    public final long l() throws et {
        Y(0);
        return this.f12632a.u();
    }

    public final long m() throws et {
        Y(1);
        return this.f12632a.y();
    }

    public final long n() throws et {
        Y(0);
        return this.f12632a.z();
    }

    public final long o() throws et {
        Y(0);
        return this.f12632a.A();
    }

    public final v p() throws et {
        Y(2);
        return this.f12632a.B();
    }

    @Deprecated
    public final Object r(Class cls, de deVar) throws et {
        Y(3);
        return T(fq.a().c(cls), deVar);
    }

    public final Object s(Class cls, de deVar) {
        Y(2);
        return U(fq.a().c(cls), deVar);
    }

    public final String t() throws et {
        Y(2);
        return this.f12632a.C();
    }

    public final String u() throws et {
        Y(2);
        return this.f12632a.D();
    }

    public final void v(Object obj, ft ftVar, de deVar) throws eu {
        Y(3);
        V(obj, ftVar, deVar);
    }

    public final void w(Object obj, ft ftVar, de deVar) throws eu {
        Y(2);
        W(obj, ftVar, deVar);
    }

    public final void x(List list) throws eu {
        int iQ;
        int iQ2;
        if (list instanceof p) {
            p pVar = (p) list;
            int iB = go.b(this.f12633b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new et();
                }
                z zVar = this.f12632a;
                int iE = zVar.e() + zVar.r();
                do {
                    pVar.g(zVar.K());
                } while (zVar.e() < iE);
                X(iE);
                return;
            }
            do {
                z zVar2 = this.f12632a;
                pVar.g(zVar2.K());
                if (zVar2.J()) {
                    return;
                } else {
                    iQ2 = zVar2.q();
                }
            } while (iQ2 == this.f12633b);
        } else {
            int iB2 = go.b(this.f12633b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new et();
                }
                z zVar3 = this.f12632a;
                int iE2 = zVar3.e() + zVar3.r();
                do {
                    list.add(Boolean.valueOf(zVar3.K()));
                } while (zVar3.e() < iE2);
                X(iE2);
                return;
            }
            do {
                z zVar4 = this.f12632a;
                list.add(Boolean.valueOf(zVar4.K()));
                if (zVar4.J()) {
                    return;
                } else {
                    iQ = zVar4.q();
                }
            } while (iQ == this.f12633b);
            iQ2 = iQ;
        }
        this.f12635d = iQ2;
    }

    public final void y(List list) throws et {
        int iQ;
        if (go.b(this.f12633b) != 2) {
            throw new et();
        }
        do {
            list.add(p());
            z zVar = this.f12632a;
            if (zVar.J()) {
                return;
            } else {
                iQ = zVar.q();
            }
        } while (iQ == this.f12633b);
        this.f12635d = iQ;
    }

    public final void z(List list) throws eu {
        int iQ;
        int iQ2;
        if (list instanceof cz) {
            cz czVar = (cz) list;
            int iB = go.b(this.f12633b);
            if (iB != 1) {
                if (iB != 2) {
                    throw new et();
                }
                z zVar = this.f12632a;
                int iR = zVar.r();
                aa(iR);
                int iE = zVar.e() + iR;
                do {
                    czVar.h(zVar.b());
                } while (zVar.e() < iE);
                return;
            }
            do {
                z zVar2 = this.f12632a;
                czVar.h(zVar2.b());
                if (zVar2.J()) {
                    return;
                } else {
                    iQ2 = zVar2.q();
                }
            } while (iQ2 == this.f12633b);
        } else {
            int iB2 = go.b(this.f12633b);
            if (iB2 != 1) {
                if (iB2 != 2) {
                    throw new et();
                }
                z zVar3 = this.f12632a;
                int iR2 = zVar3.r();
                aa(iR2);
                int iE2 = zVar3.e() + iR2;
                do {
                    list.add(Double.valueOf(zVar3.b()));
                } while (zVar3.e() < iE2);
                return;
            }
            do {
                z zVar4 = this.f12632a;
                list.add(Double.valueOf(zVar4.b()));
                if (zVar4.J()) {
                    return;
                } else {
                    iQ = zVar4.q();
                }
            } while (iQ == this.f12633b);
            iQ2 = iQ;
        }
        this.f12635d = iQ2;
    }
}
