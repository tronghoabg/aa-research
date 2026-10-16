package androidx.compose.ui.text.font;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;
import androidx.compose.ui.text.font.FontVariation;
import java.io.File;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AndroidFontKt {
    /* renamed from: Font-Ej4NQ78, reason: not valid java name */
    public static final Font m10604FontEj4NQ78(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i2, FontVariation.Settings settings) {
        return new AndroidFileDescriptorFont(parcelFileDescriptor, fontWeight, i2, settings, null);
    }

    /* renamed from: Font-Ej4NQ78$default, reason: not valid java name */
    public static /* synthetic */ Font m10606FontEj4NQ78$default(ParcelFileDescriptor parcelFileDescriptor, FontWeight fontWeight, int i2, FontVariation.Settings settings, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i3 & 4) != 0) {
            i2 = FontStyle.Companion.m10668getNormal_LCdwA();
        }
        if ((i3 & 8) != 0) {
            settings = FontVariation.INSTANCE.m10684Settings6EWAqTQ(fontWeight, i2, new FontVariation.Setting[0]);
        }
        return m10604FontEj4NQ78(parcelFileDescriptor, fontWeight, i2, settings);
    }

    /* renamed from: Font-MuC2MFs, reason: not valid java name */
    public static final Font m10608FontMuC2MFs(String str, AssetManager assetManager, FontWeight fontWeight, int i2, FontVariation.Settings settings) {
        return new AndroidAssetFont(assetManager, str, fontWeight, i2, settings, null);
    }

    /* renamed from: Font-MuC2MFs$default, reason: not valid java name */
    public static /* synthetic */ Font m10609FontMuC2MFs$default(String str, AssetManager assetManager, FontWeight fontWeight, int i2, FontVariation.Settings settings, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i3 & 8) != 0) {
            i2 = FontStyle.Companion.m10668getNormal_LCdwA();
        }
        if ((i3 & 16) != 0) {
            settings = FontVariation.INSTANCE.m10684Settings6EWAqTQ(fontWeight, i2, new FontVariation.Setting[0]);
        }
        return m10608FontMuC2MFs(str, assetManager, fontWeight, i2, settings);
    }

    /* renamed from: Font-Ej4NQ78, reason: not valid java name */
    public static final Font m10605FontEj4NQ78(File file, FontWeight fontWeight, int i2, FontVariation.Settings settings) {
        return new AndroidFileFont(file, fontWeight, i2, settings, null);
    }

    private static final void generateAndroidFontKtForApiCompatibility() {
    }

    /* renamed from: Font-Ej4NQ78$default, reason: not valid java name */
    public static /* synthetic */ Font m10607FontEj4NQ78$default(File file, FontWeight fontWeight, int i2, FontVariation.Settings settings, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            fontWeight = FontWeight.Companion.getNormal();
        }
        if ((i3 & 4) != 0) {
            i2 = FontStyle.Companion.m10668getNormal_LCdwA();
        }
        if ((i3 & 8) != 0) {
            settings = FontVariation.INSTANCE.m10684Settings6EWAqTQ(fontWeight, i2, new FontVariation.Setting[0]);
        }
        return m10605FontEj4NQ78(file, fontWeight, i2, settings);
    }
}
