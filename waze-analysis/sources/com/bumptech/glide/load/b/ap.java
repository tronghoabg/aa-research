package com.bumptech.glide.load.b;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.api.internal.be;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ap implements ad {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3230a;

    /* renamed from: b, reason: collision with root package name */
    private final ad f3231b;

    ap(Context context, ad adVar) {
        this.f3230a = context.getApplicationContext();
        this.f3231b = adVar;
    }

    public static ae c(Context context) {
        return new o(context, 2);
    }

    public static ae d(Context context) {
        return new o(context, 3);
    }

    @Override // com.bumptech.glide.load.b.ad
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        Uri uri = (Uri) obj;
        return "android.resource".equals(uri.getScheme()) && this.f3230a.getPackageName().equals(uri.getAuthority());
    }

    @Override // com.bumptech.glide.load.b.ad
    public final /* bridge */ /* synthetic */ be b(Object obj, int i2, int i3, com.bumptech.glide.load.s sVar) throws NumberFormatException {
        Uri uri = (Uri) obj;
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 1) {
            try {
                int i4 = Integer.parseInt(uri.getPathSegments().get(0));
                if (i4 != 0) {
                    return this.f3231b.b(Integer.valueOf(i4), i2, i3, sVar);
                }
                if (Log.isLoggable("ResourceUriLoader", 5)) {
                    Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + String.valueOf(uri));
                }
                return null;
            } catch (NumberFormatException e2) {
                if (Log.isLoggable("ResourceUriLoader", 5)) {
                    Log.w("ResourceUriLoader", "Failed to parse resource id from: ".concat(String.valueOf(String.valueOf(uri))), e2);
                }
                return null;
            }
        }
        if (pathSegments.size() != 2) {
            if (!Log.isLoggable("ResourceUriLoader", 5)) {
                return null;
            }
            Log.w("ResourceUriLoader", "Failed to parse resource uri: ".concat(String.valueOf(String.valueOf(uri))));
            return null;
        }
        List<String> pathSegments2 = uri.getPathSegments();
        String str = pathSegments2.get(0);
        String str2 = pathSegments2.get(1);
        Context context = this.f3230a;
        int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
        if (identifier != 0) {
            return this.f3231b.b(Integer.valueOf(identifier), i2, i3, sVar);
        }
        if (Log.isLoggable("ResourceUriLoader", 5)) {
            Log.w("ResourceUriLoader", "Failed to find resource id for: ".concat(String.valueOf(String.valueOf(uri))));
        }
        return null;
    }
}
