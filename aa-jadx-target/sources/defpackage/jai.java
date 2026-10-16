package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class jai implements java.nio.channels.WritableByteChannel {
    final /* synthetic */ defpackage.jak a;
    private int e;
    private int f;
    private int g;
    private byte h;
    private boolean i;
    private boolean j;
    private int k;
    private boolean l;
    private final defpackage.wyz n;
    private final java.util.BitSet m = new java.util.BitSet();
    private final java.nio.ByteBuffer[] b = new java.nio.ByteBuffer[256];
    private final java.nio.ByteBuffer c = java.nio.ByteBuffer.allocate(8);
    private final java.nio.ByteBuffer d = java.nio.ByteBuffer.allocate(16384);

    public jai(defpackage.jak jakVar, defpackage.wyz wyzVar) {
        this.a = jakVar;
        this.n = wyzVar;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        defpackage.izk izkVar;
        defpackage.jak jakVar = this.a;
        if (jakVar.d.getAndSet(false)) {
            if (!defpackage.acsd.C()) {
                this.a.k.a(defpackage.zak.READER_CLOSE);
                return;
            }
            defpackage.izq izqVar = jakVar.k;
            defpackage.ysr.bk(defpackage.acsd.C(), "Flag FrameworkGalFeature.postReaderCloseOnControlChannelHandler() must be enabled to call onReceiverClosed");
            java.lang.Object obj = izqVar.a;
            synchronized (((defpackage.izs) obj).d) {
                izkVar = ((defpackage.izs) obj).c[0];
            }
            if (izkVar == null) {
                defpackage.izs.a.h().ai(1674).u("onReceiverClosed: control channel is null, dropping READER_CLOSE as channel manager is stopping");
            } else {
                izkVar.m.post(new defpackage.iqv(izqVar, 16));
            }
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX WARN: Code duplicated, block: B:126:0x025e A[Catch: OutOfMemoryError -> 0x013d, IOException -> 0x0140, jac -> 0x0143, TryCatch #8 {jac -> 0x0143, IOException -> 0x0140, OutOfMemoryError -> 0x013d, blocks: (B:24:0x006b, B:25:0x0074, B:44:0x00cc, B:46:0x00d1, B:47:0x00d4, B:42:0x00c9, B:52:0x00e3, B:54:0x00e8, B:59:0x0109, B:61:0x0111, B:62:0x0129, B:63:0x0130, B:64:0x0131, B:65:0x013c, B:55:0x00ec, B:57:0x00ff, B:73:0x0148, B:75:0x0150, B:78:0x0156, B:80:0x015a, B:82:0x015e, B:83:0x0171, B:84:0x017a, B:88:0x0183, B:89:0x0185, B:91:0x0189, B:93:0x0196, B:124:0x025a, B:126:0x025e, B:128:0x0268, B:130:0x0277, B:132:0x027b, B:139:0x02b1, B:146:0x02d2, B:134:0x0292, B:138:0x02a1, B:140:0x02b8, B:141:0x02bf, B:142:0x02c0, B:143:0x02c7, B:144:0x02c8, B:147:0x02d6, B:148:0x02dd, B:94:0x01bb, B:96:0x01d3, B:98:0x01e1, B:99:0x01e8, B:100:0x01ed, B:121:0x0248, B:103:0x01f3, B:106:0x01fa, B:108:0x0208, B:111:0x020e, B:113:0x0212, B:115:0x021a, B:116:0x0222, B:119:0x0227, B:120:0x0247, B:149:0x02de, B:150:0x02e5), top: B:187:0x006b }] */
    /* JADX WARN: Code duplicated, block: B:128:0x0268 A[Catch: OutOfMemoryError -> 0x013d, IOException -> 0x0140, jac -> 0x0143, TryCatch #8 {jac -> 0x0143, IOException -> 0x0140, OutOfMemoryError -> 0x013d, blocks: (B:24:0x006b, B:25:0x0074, B:44:0x00cc, B:46:0x00d1, B:47:0x00d4, B:42:0x00c9, B:52:0x00e3, B:54:0x00e8, B:59:0x0109, B:61:0x0111, B:62:0x0129, B:63:0x0130, B:64:0x0131, B:65:0x013c, B:55:0x00ec, B:57:0x00ff, B:73:0x0148, B:75:0x0150, B:78:0x0156, B:80:0x015a, B:82:0x015e, B:83:0x0171, B:84:0x017a, B:88:0x0183, B:89:0x0185, B:91:0x0189, B:93:0x0196, B:124:0x025a, B:126:0x025e, B:128:0x0268, B:130:0x0277, B:132:0x027b, B:139:0x02b1, B:146:0x02d2, B:134:0x0292, B:138:0x02a1, B:140:0x02b8, B:141:0x02bf, B:142:0x02c0, B:143:0x02c7, B:144:0x02c8, B:147:0x02d6, B:148:0x02dd, B:94:0x01bb, B:96:0x01d3, B:98:0x01e1, B:99:0x01e8, B:100:0x01ed, B:121:0x0248, B:103:0x01f3, B:106:0x01fa, B:108:0x0208, B:111:0x020e, B:113:0x0212, B:115:0x021a, B:116:0x0222, B:119:0x0227, B:120:0x0247, B:149:0x02de, B:150:0x02e5), top: B:187:0x006b }] */
    /* JADX WARN: Code duplicated, block: B:130:0x0277 A[Catch: OutOfMemoryError -> 0x013d, IOException -> 0x0140, jac -> 0x0143, TryCatch #8 {jac -> 0x0143, IOException -> 0x0140, OutOfMemoryError -> 0x013d, blocks: (B:24:0x006b, B:25:0x0074, B:44:0x00cc, B:46:0x00d1, B:47:0x00d4, B:42:0x00c9, B:52:0x00e3, B:54:0x00e8, B:59:0x0109, B:61:0x0111, B:62:0x0129, B:63:0x0130, B:64:0x0131, B:65:0x013c, B:55:0x00ec, B:57:0x00ff, B:73:0x0148, B:75:0x0150, B:78:0x0156, B:80:0x015a, B:82:0x015e, B:83:0x0171, B:84:0x017a, B:88:0x0183, B:89:0x0185, B:91:0x0189, B:93:0x0196, B:124:0x025a, B:126:0x025e, B:128:0x0268, B:130:0x0277, B:132:0x027b, B:139:0x02b1, B:146:0x02d2, B:134:0x0292, B:138:0x02a1, B:140:0x02b8, B:141:0x02bf, B:142:0x02c0, B:143:0x02c7, B:144:0x02c8, B:147:0x02d6, B:148:0x02dd, B:94:0x01bb, B:96:0x01d3, B:98:0x01e1, B:99:0x01e8, B:100:0x01ed, B:121:0x0248, B:103:0x01f3, B:106:0x01fa, B:108:0x0208, B:111:0x020e, B:113:0x0212, B:115:0x021a, B:116:0x0222, B:119:0x0227, B:120:0x0247, B:149:0x02de, B:150:0x02e5), top: B:187:0x006b }] */
    /* JADX WARN: Code duplicated, block: B:133:0x0290 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:134:0x0292 A[Catch: OutOfMemoryError -> 0x013d, IOException -> 0x0140, jac -> 0x0143, TryCatch #8 {jac -> 0x0143, IOException -> 0x0140, OutOfMemoryError -> 0x013d, blocks: (B:24:0x006b, B:25:0x0074, B:44:0x00cc, B:46:0x00d1, B:47:0x00d4, B:42:0x00c9, B:52:0x00e3, B:54:0x00e8, B:59:0x0109, B:61:0x0111, B:62:0x0129, B:63:0x0130, B:64:0x0131, B:65:0x013c, B:55:0x00ec, B:57:0x00ff, B:73:0x0148, B:75:0x0150, B:78:0x0156, B:80:0x015a, B:82:0x015e, B:83:0x0171, B:84:0x017a, B:88:0x0183, B:89:0x0185, B:91:0x0189, B:93:0x0196, B:124:0x025a, B:126:0x025e, B:128:0x0268, B:130:0x0277, B:132:0x027b, B:139:0x02b1, B:146:0x02d2, B:134:0x0292, B:138:0x02a1, B:140:0x02b8, B:141:0x02bf, B:142:0x02c0, B:143:0x02c7, B:144:0x02c8, B:147:0x02d6, B:148:0x02dd, B:94:0x01bb, B:96:0x01d3, B:98:0x01e1, B:99:0x01e8, B:100:0x01ed, B:121:0x0248, B:103:0x01f3, B:106:0x01fa, B:108:0x0208, B:111:0x020e, B:113:0x0212, B:115:0x021a, B:116:0x0222, B:119:0x0227, B:120:0x0247, B:149:0x02de, B:150:0x02e5), top: B:187:0x006b }] */
    /* JADX WARN: Code duplicated, block: B:136:0x029e  */
    /* JADX WARN: Code duplicated, block: B:137:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:144:0x02c8 A[Catch: OutOfMemoryError -> 0x013d, IOException -> 0x0140, jac -> 0x0143, TryCatch #8 {jac -> 0x0143, IOException -> 0x0140, OutOfMemoryError -> 0x013d, blocks: (B:24:0x006b, B:25:0x0074, B:44:0x00cc, B:46:0x00d1, B:47:0x00d4, B:42:0x00c9, B:52:0x00e3, B:54:0x00e8, B:59:0x0109, B:61:0x0111, B:62:0x0129, B:63:0x0130, B:64:0x0131, B:65:0x013c, B:55:0x00ec, B:57:0x00ff, B:73:0x0148, B:75:0x0150, B:78:0x0156, B:80:0x015a, B:82:0x015e, B:83:0x0171, B:84:0x017a, B:88:0x0183, B:89:0x0185, B:91:0x0189, B:93:0x0196, B:124:0x025a, B:126:0x025e, B:128:0x0268, B:130:0x0277, B:132:0x027b, B:139:0x02b1, B:146:0x02d2, B:134:0x0292, B:138:0x02a1, B:140:0x02b8, B:141:0x02bf, B:142:0x02c0, B:143:0x02c7, B:144:0x02c8, B:147:0x02d6, B:148:0x02dd, B:94:0x01bb, B:96:0x01d3, B:98:0x01e1, B:99:0x01e8, B:100:0x01ed, B:121:0x0248, B:103:0x01f3, B:106:0x01fa, B:108:0x0208, B:111:0x020e, B:113:0x0212, B:115:0x021a, B:116:0x0222, B:119:0x0227, B:120:0x0247, B:149:0x02de, B:150:0x02e5), top: B:187:0x006b }] */
    /* JADX WARN: Code duplicated, block: B:195:0x02c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x02b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x02d6 A[SYNTHETIC] */
    @Override // java.nio.channels.WritableByteChannel
    public final int write(java.nio.ByteBuffer byteBuffer) {
        defpackage.jcs jcsVar;
        android.content.Context context;
        int iPosition;
        int iLimit;
        boolean z;
        int i;
        byte b;
        int i2;
        int i3;
        char c;
        if (this.e != 3) {
            int i4 = 4;
            try {
                byte[] bArrArray = byteBuffer.array();
                int iLimit2 = byteBuffer.limit();
                int i5 = 0;
                int iMin = 0;
                while (true) {
                    i5 += iMin;
                    if (i5 >= iLimit2) {
                        break;
                    }
                    int i6 = this.e;
                    int i7 = iLimit2 - i5;
                    if (i6 == 0) {
                        java.nio.ByteBuffer byteBuffer2 = this.c;
                        int iMin2 = java.lang.Math.min(4 - byteBuffer2.position(), i7);
                        byteBuffer2.put(bArrArray, i5, iMin2);
                        if (byteBuffer2.position() == i4) {
                            byteBuffer2.rewind();
                            this.f = byteBuffer2.get() & 255;
                            byte b2 = byteBuffer2.get();
                            this.h = b2;
                            this.i = (b2 & 8) != 0;
                            this.j = (b2 & 2) != 0;
                            char c2 = (char) byteBuffer2.getShort();
                            this.g = c2;
                            this.k = c2;
                            iyw iywVar = this.a.g;
                            if (iywVar != null) {
                                jcsVar = null;
                                try {
                                    int i8 = this.f;
                                    byte b3 = this.h;
                                    synchronized (iywVar.b) {
                                        int i9 = iywVar.g.get(i8, -1);
                                        android.util.SparseArray sparseArray = iywVar.d;
                                        if (sparseArray.get(i9) != null) {
                                            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                                            java.util.Iterator it = ((android.util.ArrayMap) sparseArray.get(i9)).keySet().iterator();
                                            while (it.hasNext()) {
                                                try {
                                                    b = b3;
                                                    i2 = i8;
                                                    i3 = i9;
                                                    c = c2;
                                                    try {
                                                        ((iyv) it.next()).b.g(jCurrentTimeMillis, i2, i3, b, c);
                                                    } catch (android.os.RemoteException unused) {
                                                    }
                                                } catch (android.os.RemoteException unused2) {
                                                    b = b3;
                                                    i2 = i8;
                                                    i3 = i9;
                                                    c = c2;
                                                }
                                                i8 = i2;
                                                i9 = i3;
                                                b3 = b;
                                                c2 = c;
                                            }
                                        }
                                    }
                                } catch (defpackage.jac e) {
                                    e = e;
                                } catch (java.io.IOException e2) {
                                    e = e2;
                                } catch (java.lang.OutOfMemoryError e3) {
                                    e = e3;
                                }
                            }
                            if ((this.h & 1) != 0) {
                                this.e = 1;
                            } else {
                                this.e = 2;
                                byteBuffer2.clear();
                            }
                        }
                        iMin = iMin2;
                    } else if (i6 == 1) {
                        if ((this.h & 2) != 0) {
                            i = this.g;
                            iMin = 0;
                        } else {
                            java.nio.ByteBuffer byteBuffer3 = this.c;
                            iMin = java.lang.Math.min(byteBuffer3.remaining(), i7);
                            byteBuffer3.put(bArrArray, i5, iMin);
                            if (byteBuffer3.position() == 8) {
                                byteBuffer3.position(4);
                                i = byteBuffer3.getInt();
                            } else {
                                continue;
                            }
                        }
                        if (i < 0) {
                            throw new defpackage.jac(defpackage.a.bo(i, "Wrong size: "));
                        }
                        java.nio.ByteBuffer[] byteBufferArr = this.b;
                        if (byteBufferArr[this.f] != null) {
                            throw new defpackage.jac("Received duplicate first fragment");
                        }
                        this.c.clear();
                        byteBufferArr[this.f] = java.nio.ByteBuffer.allocate(i);
                        byteBufferArr[this.f].limit(i);
                        this.e = 2;
                    } else if (i6 == 2) {
                        java.nio.ByteBuffer[] byteBufferArr2 = this.b;
                        int i10 = this.f;
                        java.nio.ByteBuffer byteBuffer4 = byteBufferArr2[i10];
                        if (byteBuffer4 == null) {
                            throw new defpackage.jac("Unexpected continuation fragment");
                        }
                        boolean z2 = this.i;
                        defpackage.jak jakVar = this.a;
                        if (z2) {
                            if (jakVar.f == null && !this.l) {
                                defpackage.jak.a.f().ai(1731).ad(this.f, this.h);
                                try {
                                    jakVar.e.tryAcquire(250L, java.util.concurrent.TimeUnit.MILLISECONDS);
                                } catch (java.lang.InterruptedException unused3) {
                                }
                                this.l = this.a.f == null;
                            }
                            if (this.l) {
                                iMin = java.lang.Math.min(this.k, i7);
                                int i11 = this.k - iMin;
                                this.k = i11;
                                if (i11 == 0) {
                                    defpackage.jak.a.f().ai(1730).R("Ignoring encrypted frame with no ssl: %d %d 0x%X", java.lang.Integer.valueOf(this.g), java.lang.Integer.valueOf(this.f), java.lang.Byte.valueOf(this.h));
                                    if (this.j) {
                                        if (!this.a.d.get()) {
                                            throw new java.io.IOException("should stop");
                                        }
                                        iPosition = byteBuffer4.position();
                                        iLimit = byteBuffer4.limit();
                                        byteBuffer4.rewind();
                                        if (!this.l && this.i) {
                                            defpackage.jak.a.f().ai(1729).u("Encrypted frame with no ssl, skipping message");
                                            this.l = false;
                                        } else {
                                            if (iPosition != iLimit) {
                                                throw new defpackage.jac("Fragment underflow");
                                            }
                                            defpackage.wyz wyzVar = this.n;
                                            int i12 = this.f;
                                            if ((this.h & 4) != 0) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            java.lang.Object obj = wyzVar.a;
                                            ((defpackage.izs) obj).d(i12, ((defpackage.izs) obj).w.b(byteBuffer4), z);
                                        }
                                        this.b[this.f] = null;
                                    } else if (byteBuffer4.position() >= byteBuffer4.limit()) {
                                        throw new defpackage.jac("Fragment overflow");
                                    }
                                    this.e = 0;
                                } else {
                                    continue;
                                }
                            } else {
                                int i13 = this.g;
                                java.nio.ByteBuffer byteBuffer5 = this.d;
                                iMin = java.lang.Math.min(i13 - byteBuffer5.position(), i7);
                                byteBuffer5.put(bArrArray, i5, iMin);
                                if (byteBuffer5.position() == this.g) {
                                    byteBuffer5.flip();
                                    this.a.f.e(byteBuffer5, byteBuffer4);
                                    if (this.j) {
                                        byteBuffer4.limit(byteBuffer4.position());
                                    }
                                    byteBuffer5.clear();
                                    if (this.j) {
                                        if (!this.a.d.get()) {
                                            throw new java.io.IOException("should stop");
                                        }
                                        iPosition = byteBuffer4.position();
                                        iLimit = byteBuffer4.limit();
                                        byteBuffer4.rewind();
                                        if (!this.l) {
                                            if (iPosition != iLimit) {
                                                throw new defpackage.jac("Fragment underflow");
                                            }
                                            defpackage.wyz wyzVar2 = this.n;
                                            int i14 = this.f;
                                            if ((this.h & 4) != 0) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            java.lang.Object obj2 = wyzVar2.a;
                                            ((defpackage.izs) obj2).d(i14, ((defpackage.izs) obj2).w.b(byteBuffer4), z);
                                        } else {
                                            if (iPosition != iLimit) {
                                                throw new defpackage.jac("Fragment underflow");
                                            }
                                            defpackage.wyz wyzVar3 = this.n;
                                            int i15 = this.f;
                                            if ((this.h & 4) != 0) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            java.lang.Object obj3 = wyzVar3.a;
                                            ((defpackage.izs) obj3).d(i15, ((defpackage.izs) obj3).w.b(byteBuffer4), z);
                                        }
                                        this.b[this.f] = null;
                                    } else if (byteBuffer4.position() >= byteBuffer4.limit()) {
                                        throw new defpackage.jac("Fragment overflow");
                                    }
                                    this.e = 0;
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            if ((jakVar.f != null || i10 != 0) && (this.h & 1) != 0) {
                                int i16 = i7 >= 2 ? ((bArrArray[i5] & 255) << 8) | (bArrArray[i5 + 1] & 255) : -1;
                                if (jakVar.j && i16 >= 0 && (context = jakVar.b) != null) {
                                    java.util.BitSet bitSet = this.m;
                                    if (!bitSet.get(i16)) {
                                        bitSet.set(i16);
                                        defpackage.omv.j(context, defpackage.yyn.FRAMER_READ_UNEXPECTED_UNENCRYPTED_MESSAGE, i16);
                                    }
                                }
                                if (jakVar.i) {
                                    throw new defpackage.jac("Unencrypted frame not allowed on channel: " + this.f + ", message type: " + i16);
                                }
                            }
                            iMin = java.lang.Math.min(this.k, i7);
                            byteBuffer4.put(bArrArray, i5, iMin);
                            int i17 = this.k - iMin;
                            this.k = i17;
                            if (i17 == 0) {
                                if (this.j) {
                                    if (!this.a.d.get()) {
                                        throw new java.io.IOException("should stop");
                                    }
                                    iPosition = byteBuffer4.position();
                                    iLimit = byteBuffer4.limit();
                                    byteBuffer4.rewind();
                                    if (!this.l) {
                                        if (iPosition != iLimit) {
                                            throw new defpackage.jac("Fragment underflow");
                                        }
                                        defpackage.wyz wyzVar4 = this.n;
                                        int i18 = this.f;
                                        if ((this.h & 4) != 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        java.lang.Object obj4 = wyzVar4.a;
                                        ((defpackage.izs) obj4).d(i18, ((defpackage.izs) obj4).w.b(byteBuffer4), z);
                                    } else {
                                        if (iPosition != iLimit) {
                                            throw new defpackage.jac("Fragment underflow");
                                        }
                                        defpackage.wyz wyzVar5 = this.n;
                                        int i19 = this.f;
                                        if ((this.h & 4) != 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        java.lang.Object obj5 = wyzVar5.a;
                                        ((defpackage.izs) obj5).d(i19, ((defpackage.izs) obj5).w.b(byteBuffer4), z);
                                    }
                                    this.b[this.f] = null;
                                } else if (byteBuffer4.position() >= byteBuffer4.limit()) {
                                    throw new defpackage.jac("Fragment overflow");
                                }
                                this.e = 0;
                            }
                        }
                    } else {
                        iMin = 0;
                    }
                    i4 = 4;
                    defpackage.jak.a.h().p(e).ai(1732).u("Receiver:");
                    this.e = 3;
                    defpackage.jak jakVar2 = this.a;
                    jakVar2.d.set(false);
                    if (e instanceof defpackage.jac) {
                        defpackage.izq izqVar = jakVar2.k;
                        defpackage.izs.a.h().ai(1675).u("Framing Error encountered.");
                        java.lang.Object obj6 = izqVar.a;
                        defpackage.jcu jcuVar = new defpackage.jcu(java.nio.ByteBuffer.allocate(2), jcsVar, false);
                        jcuVar.v((short) -1);
                        defpackage.izs izsVar = (defpackage.izs) obj6;
                        izsVar.g(0, jcuVar, false, false, new defpackage.izu(false, false, 0));
                        izsVar.c(true);
                    } else if (e instanceof java.lang.OutOfMemoryError) {
                        jakVar2.k.a(defpackage.zak.OUT_OF_MEMORY);
                    } else {
                        jakVar2.k.a(defpackage.zak.READER_IO_ERROR);
                    }
                }
            } catch (defpackage.jac | java.io.IOException | java.lang.OutOfMemoryError e4) {
                e = e4;
                jcsVar = null;
            }
            int i20 = this.e;
            if (i20 == 0) {
                return 4 - this.c.position();
            }
            if (i20 == 1) {
                return 8 - this.c.position();
            }
            if (i20 == 2) {
                return this.k;
            }
        }
        return -1;
    }
}
