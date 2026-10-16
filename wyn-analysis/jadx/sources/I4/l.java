package I4;

import android.content.Context;
import android.net.Uri;
import com.unity3d.services.core.device.MimeTypes;

/* loaded from: classes.dex */
public final class l implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5349a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f5350b;

    public l(Context context, int i5) {
        this.f5349a = i5;
        switch (i5) {
            case 1:
                this.f5350b = context.getApplicationContext();
                break;
            case 2:
                this.f5350b = context.getApplicationContext();
                break;
            default:
                this.f5350b = context;
                break;
        }
    }

    @Override // I4.p
    public final boolean a(Object obj) {
        switch (this.f5349a) {
            case 0:
                return Fe.g.D((Uri) obj);
            case 1:
                Uri uri = (Uri) obj;
                return Fe.g.D(uri) && !uri.getPathSegments().contains(MimeTypes.BASE_TYPE_VIDEO);
            default:
                Uri uri2 = (Uri) obj;
                return Fe.g.D(uri2) && uri2.getPathSegments().contains(MimeTypes.BASE_TYPE_VIDEO);
        }
    }

    @Override // I4.p
    public final o b(Object obj, int i5, int i10, B4.g gVar) {
        Long l10;
        switch (this.f5349a) {
            case 0:
                Uri uri = (Uri) obj;
                return new o(new X4.b(uri), new k(0, this.f5350b, uri));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i5 == Integer.MIN_VALUE || i10 == Integer.MIN_VALUE || i5 > 512 || i10 > 384) {
                    return null;
                }
                X4.b bVar = new X4.b(uri2);
                Context context = this.f5350b;
                return new o(bVar, new D4.b(0, uri2, new D4.d(com.bumptech.glide.b.b(context).f24213d.i(), new D4.a(context.getContentResolver(), 0), com.bumptech.glide.b.b(context).f24214e, context.getContentResolver())));
            default:
                Uri uri3 = (Uri) obj;
                if (i5 == Integer.MIN_VALUE || i10 == Integer.MIN_VALUE || i5 > 512 || i10 > 384 || (l10 = (Long) gVar.c(L4.B.f6882d)) == null || l10.longValue() != -1) {
                    return null;
                }
                X4.b bVar2 = new X4.b(uri3);
                Context context2 = this.f5350b;
                return new o(bVar2, new D4.b(0, uri3, new D4.d(com.bumptech.glide.b.b(context2).f24213d.i(), new D4.a(context2.getContentResolver(), 1), com.bumptech.glide.b.b(context2).f24214e, context2.getContentResolver())));
        }
    }
}
