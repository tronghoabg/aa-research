package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wgq implements defpackage.wft {
    public boolean a;
    private final boolean b;

    public wgq(boolean z) {
        this.b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.Object, wgu] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, wgu] */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, wgu] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object, wgu] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, wgu] */
    @Override // defpackage.wft
    public final /* synthetic */ java.lang.Object a(defpackage.ret retVar) throws java.io.IOException {
        defpackage.wgd wgdVar;
        java.io.Closeable closeableL;
        java.nio.channels.FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary;
        defpackage.xyn xynVarA;
        ?? wgdVar2;
        android.net.Uri uriBuild = ((android.net.Uri) retVar.f).buildUpon().path(java.lang.String.valueOf(((android.net.Uri) retVar.a).getPath()).concat(".lock")).fragment("").build();
        java.io.Closeable closeable = null;
        if (this.a) {
            java.util.concurrent.Semaphore semaphoreB = retVar.d.k().b(uriBuild.toString());
            if (true != semaphoreB.tryAcquire()) {
                semaphoreB = null;
            }
            defpackage.wge wgeVar = new defpackage.wge(semaphoreB);
            try {
                if (wgeVar.a != null) {
                    wgdVar = new defpackage.wgd(wgeVar.a(), 0);
                    wgeVar.close();
                } else {
                    wgeVar.close();
                    wgdVar = null;
                }
            } catch (java.lang.Throwable th) {
                try {
                    wgeVar.close();
                    throw th;
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } else {
            java.util.concurrent.Semaphore semaphoreB2 = retVar.d.k().b(uriBuild.toString());
            try {
                semaphoreB2.acquire();
                defpackage.wge wgeVar2 = new defpackage.wge(semaphoreB2);
                try {
                    wgdVar = new defpackage.wgd(wgeVar2.a(), 0);
                    wgeVar2.close();
                } catch (java.lang.Throwable th3) {
                    try {
                        wgeVar2.close();
                        throw th3;
                    } catch (java.lang.Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            } catch (java.lang.InterruptedException e) {
                throw new java.io.InterruptedIOException("semaphore not acquired: ".concat(e.toString()));
            }
        }
        defpackage.wgh wghVar = new defpackage.wgh(wgdVar);
        try {
            if (wghVar.a != null) {
                boolean z = this.b;
                if (z) {
                    closeableL = (java.io.Closeable) ((defpackage.ngb) retVar.b).d(uriBuild, new defpackage.wgs(1));
                } else {
                    closeableL = retVar.d.l(uriBuild);
                }
                defpackage.wgh wghVar2 = new defpackage.wgh(closeableL);
                try {
                    java.io.Closeable closeable2 = wghVar2.a;
                    if (closeable2 instanceof defpackage.wga) {
                        fileChannelConvertMaybeLegacyFileChannelFromLibrary = ((defpackage.wga) closeable2).a();
                    } else {
                        if (!(closeable2 instanceof java.io.RandomAccessFile)) {
                            throw new java.io.IOException("Lock stream not convertible to FileChannel");
                        }
                        fileChannelConvertMaybeLegacyFileChannelFromLibrary = j$.nio.channels.DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(((java.io.RandomAccessFile) closeable2).getChannel());
                    }
                    java.nio.channels.FileChannel fileChannel = fileChannelConvertMaybeLegacyFileChannelFromLibrary;
                    if (this.a) {
                        retVar.d.k();
                        try {
                            java.nio.channels.FileLock fileLockTryLock = fileChannel.tryLock(0L, Long.MAX_VALUE, z);
                            wgdVar2 = fileLockTryLock == null ? 0 : new defpackage.wgd(fileLockTryLock, 1);
                        } catch (java.io.IOException unused) {
                        }
                    } else {
                        retVar.d.k();
                        defpackage.xyn xynVarA2 = defpackage.wgf.a(fileChannel, z);
                        if (xynVarA2.f()) {
                            wgdVar2 = xynVarA2.b();
                        } else {
                            defpackage.wgf.a.longValue();
                            defpackage.wgf.b.longValue();
                            wgl wglVar = new wgl();
                            do {
                                android.os.SystemClock.sleep(wglVar.a().longValue());
                                xynVarA = defpackage.wgf.a(fileChannel, z);
                            } while (!xynVarA.f());
                            wgdVar2 = xynVarA.b();
                        }
                    }
                    defpackage.wgh wghVar3 = new defpackage.wgh(wgdVar2);
                    try {
                        if (wghVar3.a != null) {
                            final java.io.Closeable closeableA = wghVar.a();
                            final java.io.Closeable closeableA2 = wghVar2.a();
                            final java.io.Closeable closeableA3 = wghVar3.a();
                            closeable = new java.io.Closeable() { // from class: wgp
                                @Override // java.io.Closeable, java.lang.AutoCloseable
                                public final void close() throws java.io.IOException {
                                    java.io.Closeable closeable3 = closeableA;
                                    java.io.Closeable closeable4 = closeableA2;
                                    java.io.Closeable closeable5 = closeableA3;
                                    if (closeable5 != null) {
                                        try {
                                            try {
                                                closeable5.close();
                                            } catch (java.lang.Throwable th5) {
                                                if (closeable4 != null) {
                                                    try {
                                                        closeable4.close();
                                                    } catch (java.lang.Throwable th6) {
                                                        th5.addSuppressed(th6);
                                                    }
                                                }
                                                throw th5;
                                            }
                                        } catch (java.lang.Throwable th7) {
                                            if (closeable3 != null) {
                                                try {
                                                    closeable3.close();
                                                } catch (java.lang.Throwable th8) {
                                                    th7.addSuppressed(th8);
                                                }
                                            }
                                            throw th7;
                                        }
                                    }
                                    if (closeable4 != null) {
                                        closeable4.close();
                                    }
                                    if (closeable3 != null) {
                                        closeable3.close();
                                    }
                                }
                            };
                        }
                        wghVar3.close();
                        wghVar2.close();
                    } catch (java.lang.Throwable th5) {
                        try {
                            wghVar3.close();
                            throw th5;
                        } catch (java.lang.Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (java.lang.Throwable th7) {
                    try {
                        wghVar2.close();
                        throw th7;
                    } catch (java.lang.Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            wghVar.close();
            return closeable;
        } catch (java.lang.Throwable th9) {
            try {
                wghVar.close();
                throw th9;
            } catch (java.lang.Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }
}
