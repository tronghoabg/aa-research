package androidx.core.net;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class ParseException extends RuntimeException {
    public final String response;

    ParseException(String str) {
        super(str);
        this.response = str;
    }
}
