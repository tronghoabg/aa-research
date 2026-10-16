package com.google.android.gms.internal.auth;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import l7.c;

/* loaded from: classes3.dex */
public abstract class zzbz extends c {
    public final byte[] toByteArray() {
        try {
            return toString().getBytes("UTF-8");
        } catch (UnsupportedEncodingException e7) {
            Log.e("AUTH", "Error serializing object.", e7);
            return null;
        }
    }
}
