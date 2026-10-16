package com.google.android.libraries.phenotype.client;

import android.net.Uri;
import androidx.collection.SimpleArrayMap;
import com.google.e.a.h.az;
import com.google.e.a.h.bu;
import com.google.v.de;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Object f5939a;

    a(SimpleArrayMap simpleArrayMap) {
        this.f5939a = simpleArrayMap;
    }

    public static a d(byte[] bArr) {
        return new a(new ByteArrayInputStream(bArr));
    }

    public final String a(Uri uri) {
        SimpleArrayMap simpleArrayMap;
        if (uri != null) {
            simpleArrayMap = (SimpleArrayMap) ((SimpleArrayMap) this.f5939a).get(uri.toString());
        } else {
            simpleArrayMap = null;
        }
        if (simpleArrayMap == null) {
            return null;
        }
        return (String) simpleArrayMap.get("Passkeys__json_for_parcelables");
    }

    public final az b() {
        try {
            return az.parseFrom((InputStream) this.f5939a, de.a());
        } finally {
            ((InputStream) this.f5939a).close();
        }
    }

    public final bu c() throws IOException {
        try {
            return bu.parseFrom((InputStream) this.f5939a, de.a());
        } finally {
            ((InputStream) this.f5939a).close();
        }
    }

    private a(InputStream inputStream) {
        this.f5939a = inputStream;
    }
}
