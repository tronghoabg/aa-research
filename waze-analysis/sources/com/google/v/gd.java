package com.google.v;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class gd extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;

    public gd() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final eu a() {
        return new eu(getMessage());
    }
}
