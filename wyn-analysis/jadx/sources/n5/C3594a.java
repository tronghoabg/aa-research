package n5;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: n5.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3594a implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f40916a;

    public C3594a(String str) {
        this.f40916a = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith(this.f40916a);
    }
}
