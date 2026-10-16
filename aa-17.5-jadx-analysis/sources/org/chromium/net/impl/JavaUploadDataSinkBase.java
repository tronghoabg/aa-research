package org.chromium.net.impl;

import defpackage.a;
import defpackage.akbj;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;
import org.chromium.net.impl.JavaUrlRequestUtils;
import org.chromium.net.impl.VersionSafeCallbacks;

/* loaded from: classes2.dex */
public abstract class JavaUploadDataSinkBase extends UploadDataSink {
    public final AtomicInteger a = new AtomicInteger(3);
    public final Executor b;
    public final VersionSafeCallbacks.UploadDataProviderWrapper c;
    public ByteBuffer d;
    public long e;
    public long f;
    public int g;
    private final Executor h;

    @Retention(RetentionPolicy.SOURCE)
    @interface SinkState {
    }

    public JavaUploadDataSinkBase(final Executor executor, Executor executor2, UploadDataProvider uploadDataProvider) {
        this.h = new Executor(this) { // from class: org.chromium.net.impl.JavaUploadDataSinkBase.1
            final /* synthetic */ JavaUploadDataSinkBase b;

            {
                this.b = this;
            }

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RejectedExecutionException e) {
                    this.b.h(e);
                }
            }
        };
        this.b = executor2;
        this.c = new VersionSafeCallbacks.UploadDataProviderWrapper(uploadDataProvider);
    }

    private final void k(final Runnable runnable, final String str) {
        new akbj("JavaUploadDataSinkBase#executeOnExecutor ".concat(str));
        this.b.execute(new Runnable() { // from class: org.chromium.net.impl.JavaUploadDataSinkBase$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                new akbj("JavaUploadDataSinkBase#executeOnExecutor " + str + " running callback");
                runnable.run();
            }
        });
    }

    protected abstract int a(ByteBuffer byteBuffer) throws IOException;

    protected abstract Runnable b(JavaUrlRequestUtils.CheckedRunnable checkedRunnable);

    protected abstract Runnable c(JavaUrlRequestUtils.CheckedRunnable checkedRunnable);

    public final void d(final JavaUrlRequestUtils.CheckedRunnable checkedRunnable, final String str) {
        try {
            new akbj(a.bz(str, "Cronet JavaUploadDataSinkBase#executeOnUploadExecutor "));
            this.h.execute(new Runnable() { // from class: org.chromium.net.impl.JavaUploadDataSinkBase$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    new akbj("Cronet JavaUploadDataSinkBase#executeOnUploadExecutor " + str + " running callback");
                    this.a.c(checkedRunnable).run();
                }
            });
        } catch (RejectedExecutionException e) {
            h(e);
        }
    }

    protected abstract void e() throws IOException;

    protected abstract void f() throws IOException;

    protected abstract void g(long j);

    protected abstract void h(Throwable th);

    public final void i() {
        d(new JavaUrlRequestUtils.CheckedRunnable() { // from class: org.chromium.net.impl.JavaUploadDataSinkBase$$ExternalSyntheticLambda3
            @Override // org.chromium.net.impl.JavaUrlRequestUtils.CheckedRunnable
            public final void a() throws IOException {
                final JavaUploadDataSinkBase javaUploadDataSinkBase = this.a;
                javaUploadDataSinkBase.c.read(javaUploadDataSinkBase, javaUploadDataSinkBase.d);
                javaUploadDataSinkBase.b.execute(new Runnable() { // from class: org.chromium.net.impl.JavaUploadDataSinkBase$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        javaUploadDataSinkBase.g++;
                    }
                });
            }
        }, "readFromProvider");
    }

    public final void j() {
        k(b(new JavaUrlRequestUtils.CheckedRunnable() { // from class: org.chromium.net.impl.JavaUploadDataSinkBase$$ExternalSyntheticLambda4
            @Override // org.chromium.net.impl.JavaUrlRequestUtils.CheckedRunnable
            public final void a() throws IOException {
                JavaUploadDataSinkBase javaUploadDataSinkBase = this.a;
                javaUploadDataSinkBase.f();
                javaUploadDataSinkBase.a.set(0);
                javaUploadDataSinkBase.i();
            }
        }), "startRead");
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onReadError(Exception exc) {
        h(exc);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onReadSucceeded(final boolean z) {
        AtomicInteger atomicInteger = this.a;
        if (atomicInteger.compareAndSet(0, 2)) {
            k(b(new JavaUrlRequestUtils.CheckedRunnable() { // from class: org.chromium.net.impl.JavaUploadDataSinkBase$$ExternalSyntheticLambda6
                @Override // org.chromium.net.impl.JavaUrlRequestUtils.CheckedRunnable
                public final void a() throws IOException {
                    JavaUploadDataSinkBase javaUploadDataSinkBase = this.a;
                    long j = javaUploadDataSinkBase.e;
                    if (j != -1 && j - javaUploadDataSinkBase.f < javaUploadDataSinkBase.d.remaining()) {
                        javaUploadDataSinkBase.h(new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", Long.valueOf(javaUploadDataSinkBase.f + javaUploadDataSinkBase.d.remaining()), Long.valueOf(javaUploadDataSinkBase.e))));
                        return;
                    }
                    boolean z2 = z;
                    if (javaUploadDataSinkBase.d.remaining() == 0 && !z2) {
                        javaUploadDataSinkBase.h(new IllegalStateException("Bytes read can't be zero except for last chunk!"));
                        return;
                    }
                    long jA = javaUploadDataSinkBase.f + javaUploadDataSinkBase.a(javaUploadDataSinkBase.d);
                    javaUploadDataSinkBase.f = jA;
                    long j2 = javaUploadDataSinkBase.e;
                    if (jA >= j2) {
                        if (j2 == -1) {
                            if (z2) {
                                j2 = -1;
                            }
                        }
                        if (j2 == -1) {
                            javaUploadDataSinkBase.e();
                            return;
                        } else if (j2 == jA) {
                            javaUploadDataSinkBase.e();
                            return;
                        } else {
                            javaUploadDataSinkBase.h(new IllegalArgumentException(String.format(Locale.getDefault(), "Read upload data length %d exceeds expected length %d", Long.valueOf(javaUploadDataSinkBase.f), Long.valueOf(javaUploadDataSinkBase.e))));
                            return;
                        }
                    }
                    javaUploadDataSinkBase.a.set(0);
                    javaUploadDataSinkBase.i();
                }
            }), "onReadSucceeded");
            return;
        }
        throw new IllegalStateException("onReadSucceeded() called when not awaiting a read result; in state: " + atomicInteger.get());
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindError(Exception exc) {
        h(exc);
    }

    @Override // org.chromium.net.UploadDataSink
    public final void onRewindSucceeded() {
        AtomicInteger atomicInteger = this.a;
        if (atomicInteger.compareAndSet(1, 2)) {
            j();
            return;
        }
        throw new IllegalStateException("onRewindSucceeded() called when not awaiting a rewind; in state: " + atomicInteger.get());
    }
}
