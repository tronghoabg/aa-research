package S1;

import java.io.IOException;

/* loaded from: classes.dex */
public class i extends IOException {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f10862b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f10863a;

    public i(int i5) {
        this.f10863a = i5;
    }

    public i(Exception exc, int i5) {
        super(exc);
        this.f10863a = i5;
    }

    public i(String str, int i5) {
        super(str);
        this.f10863a = i5;
    }

    public i(int i5, Exception exc, String str) {
        super(str, exc);
        this.f10863a = i5;
    }
}
