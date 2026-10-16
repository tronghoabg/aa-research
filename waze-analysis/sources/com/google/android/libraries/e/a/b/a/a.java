package com.google.android.libraries.e.a.b.a;

import java.io.File;
import java.io.FileInputStream;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a extends c implements com.google.android.libraries.e.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final FileInputStream f5826a;

    /* renamed from: b, reason: collision with root package name */
    private final File f5827b;

    private a(FileInputStream fileInputStream, File file) {
        super(fileInputStream);
        this.f5826a = fileInputStream;
        this.f5827b = file;
    }

    public static a b(File file) {
        return new a(new FileInputStream(file), file);
    }

    @Override // com.google.android.libraries.e.a.b.a
    public final File a() {
        return this.f5827b;
    }
}
