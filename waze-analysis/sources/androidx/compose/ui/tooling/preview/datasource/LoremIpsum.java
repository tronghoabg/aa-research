package androidx.compose.ui.tooling.preview.datasource;

import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import h.g.a.a;
import h.g.b.ao;
import h.m.h;
import h.m.k;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class LoremIpsum implements PreviewParameterProvider<String> {
    public static final int $stable = 0;
    private final int words;

    public LoremIpsum(int i2) {
        this.words = i2;
    }

    private final String generateLoremIpsum(int i2) {
        final ao aoVar = new ao();
        final int size = LoremIpsumKt.LOREM_IPSUM_SOURCE.size();
        return k.u(k.r(k.f(new a() { // from class: androidx.compose.ui.tooling.preview.datasource.LoremIpsum$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return LoremIpsum.generateLoremIpsum$lambda$0(aoVar, size);
            }
        }), i2), " ");
    }

    static final String generateLoremIpsum$lambda$0(ao aoVar, int i2) {
        List list = LoremIpsumKt.LOREM_IPSUM_SOURCE;
        int i3 = aoVar.f48103a;
        aoVar.f48103a = i3 + 1;
        return (String) list.get(i3 % i2);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public /* synthetic */ int getCount() {
        return PreviewParameterProvider.CC.$default$getCount(this);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public /* synthetic */ String getDisplayName(int i2) {
        return null;
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public h<String> getValues() {
        return k.h(generateLoremIpsum(this.words));
    }

    public LoremIpsum() {
        this(500);
    }
}
