package org.chromium.net.impl;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class Preconditions {
    private Preconditions() {
    }

    public static void a(ByteBuffer byteBuffer) {
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("byteBuffer must be a direct ByteBuffer.");
        }
    }
}
