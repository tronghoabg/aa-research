package com.bytedance.sdk.openadsdk.oa;

import com.bytedance.sdk.component.utils.xs;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public abstract class uef {
    protected boolean uef = false;

    /* renamed from: oa, reason: collision with root package name */
    private final ExecutorService f26046oa = Executors.newSingleThreadExecutor();

    /* renamed from: com.bytedance.sdk.openadsdk.oa.uef$uef, reason: collision with other inner class name */
    public class CallableC0129uef implements Callable<Void> {

        /* renamed from: oa, reason: collision with root package name */
        private final File f26047oa;

        @Override // java.util.concurrent.Callable
        /* renamed from: uef, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            uef.this.oa(this.f26047oa);
            return null;
        }

        private CallableC0129uef(File file) {
            this.f26047oa = file;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oa(File file) throws IOException {
        if (!this.uef) {
            try {
                xs.oa(file);
            } catch (Throwable unused) {
            }
            uef(xs.uef(file.getParentFile()));
        } else {
            List<File> listUef = xs.uef(file);
            listUef.toString();
            uef(listUef);
        }
    }

    public abstract void uef(List<File> list);

    public abstract boolean uef(long j8, int i5);

    public abstract boolean uef(File file, long j8, int i5);

    public void uef(File file) throws IOException {
        this.f26046oa.submit(new CallableC0129uef(file));
    }

    public long oa(List<File> list) {
        Iterator<File> it = list.iterator();
        long length = 0;
        while (it.hasNext()) {
            length += it.next().length();
        }
        return length;
    }
}
