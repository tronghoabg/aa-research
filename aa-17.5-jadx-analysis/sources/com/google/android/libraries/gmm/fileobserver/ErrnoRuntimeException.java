package com.google.android.libraries.gmm.fileobserver;

import android.system.OsConstants;
import defpackage.a;

/* loaded from: classes3.dex */
public class ErrnoRuntimeException extends RuntimeException {
    ErrnoRuntimeException(String str, int i) {
        super(a.bJ(str, OsConstants.errnoName(i), " from "));
    }
}
