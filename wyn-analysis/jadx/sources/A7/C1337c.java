package a7;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* renamed from: a7.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1337c implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ C1337c f17394b = new C1337c(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17395a;

    public /* synthetic */ C1337c(int i5) {
        this.f17395a = i5;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f17395a) {
        }
        return ((Scope) obj).f26423b.compareTo(((Scope) obj2).f26423b);
    }
}
