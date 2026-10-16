package com.waze.uid.c;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class at implements com.waze.sharedui.views.an {

    /* renamed from: a, reason: collision with root package name */
    private final Context f44232a;

    public at(Context context) {
        h.g.b.x.f(context, "context");
        this.f44232a = context;
    }

    @Override // com.waze.sharedui.views.an
    public void a(String str) {
        Uri uri;
        Intent intent = new Intent("android.intent.action.VIEW");
        if (str != null) {
            uri = Uri.parse(str);
            h.g.b.x.e(uri, "parse(...)");
        } else {
            uri = null;
        }
        intent.setData(uri);
        this.f44232a.startActivity(intent);
    }
}
