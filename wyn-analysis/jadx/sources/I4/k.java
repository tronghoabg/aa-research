package I4;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class k implements C4.e {

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f5345d = {"_data"};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5346a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5347b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5348c;

    public /* synthetic */ k(int i5, Object obj, Object obj2) {
        this.f5346a = i5;
        this.f5347b = obj;
        this.f5348c = obj2;
    }

    @Override // C4.e
    public final void a() {
        int i5 = this.f5346a;
    }

    @Override // C4.e
    public final Class b() {
        switch (this.f5346a) {
            case 0:
                return File.class;
            default:
                return ((z) this.f5348c).b();
        }
    }

    @Override // C4.e
    public final void cancel() {
        int i5 = this.f5346a;
    }

    @Override // C4.e
    public final int d() {
        switch (this.f5346a) {
        }
        return 1;
    }

    @Override // C4.e
    public final void e(com.bumptech.glide.d dVar, C4.d dVar2) {
        Object objWrap;
        switch (this.f5346a) {
            case 0:
                Cursor cursorQuery = ((Context) this.f5347b).getContentResolver().query((Uri) this.f5348c, f5345d, null, null, null);
                if (cursorQuery != null) {
                    try {
                        string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                        cursorQuery.close();
                    } catch (Throwable th) {
                        cursorQuery.close();
                        throw th;
                    }
                }
                if (!TextUtils.isEmpty(string)) {
                    dVar2.i(new File(string));
                    return;
                }
                dVar2.c(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.f5348c)));
                return;
            default:
                z zVar = (z) this.f5348c;
                byte[] bArr = (byte[]) this.f5347b;
                switch (zVar.f5380a) {
                    case 1:
                        objWrap = ByteBuffer.wrap(bArr);
                        break;
                    default:
                        objWrap = new ByteArrayInputStream(bArr);
                        break;
                }
                dVar2.i(objWrap);
                return;
        }
    }

    private final void c() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }
}
