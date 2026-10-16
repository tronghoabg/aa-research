package com.google.android.libraries.e.a.b.a;

import java.io.File;
import java.io.FileOutputStream;
import java.io.SyncFailedException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b extends d implements com.google.android.libraries.e.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final FileOutputStream f5828a;

    /* renamed from: b, reason: collision with root package name */
    private final File f5829b;

    public b(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.f5828a = fileOutputStream;
        this.f5829b = file;
    }

    @Override // com.google.android.libraries.e.a.b.a
    public final File a() {
        return this.f5829b;
    }

    public final void b() throws SyncFailedException {
        this.f5828a.getFD().sync();
    }
}
