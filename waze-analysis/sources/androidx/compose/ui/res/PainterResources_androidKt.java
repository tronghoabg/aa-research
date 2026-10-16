package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.graphics.vector.compat.XmlVectorParser_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ImageVectorCache;
import com.waze.strings.DisplayStrings;
import h.g.b.x;
import h.n.o;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class PainterResources_androidKt {
    private static final String errorMessage = "Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP";

    private static final ImageBitmap loadImageBitmapResource(CharSequence charSequence, Resources resources, int i2) {
        try {
            return ImageResources_androidKt.imageResource(ImageBitmap.Companion, resources, i2);
        } catch (Exception e2) {
            Objects.toString(charSequence);
            throw new ResourceResolutionException("Error attempting to load resource: ".concat(String.valueOf(charSequence)), e2);
        }
    }

    private static final ImageVector loadVectorResource(Resources.Theme theme, Resources resources, int i2, int i3, Composer composer, int i4) throws Resources.NotFoundException {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(21855625, i4, -1, "androidx.compose.ui.res.loadVectorResource (PainterResources.android.kt:87)");
        }
        ImageVectorCache imageVectorCache = (ImageVectorCache) composer.consume(AndroidCompositionLocals_androidKt.getLocalImageVectorCache());
        ImageVectorCache.Key key = new ImageVectorCache.Key(theme, i2);
        ImageVectorCache.ImageVectorEntry imageVectorEntryLoadVectorResourceInner = imageVectorCache.get(key);
        if (imageVectorEntryLoadVectorResourceInner == null) {
            XmlResourceParser xml = resources.getXml(i2);
            XmlResourceParser xmlResourceParser = xml;
            XmlVectorParser_androidKt.seekToStartTag(xmlResourceParser);
            if (!x.n(xmlResourceParser.getName(), "vector")) {
                throw new IllegalArgumentException(errorMessage);
            }
            imageVectorEntryLoadVectorResourceInner = VectorResources_androidKt.loadVectorResourceInner(theme, resources, xml, i3);
            imageVectorCache.set(key, imageVectorEntryLoadVectorResourceInner);
        }
        ImageVector imageVector = imageVectorEntryLoadVectorResourceInner.getImageVector();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return imageVector;
    }

    public static final Painter painterResource(int i2, Composer composer, int i3) {
        BitmapPainter bitmapPainter;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(473971343, i3, -1, "androidx.compose.ui.res.painterResource (PainterResources.android.kt:56)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        Resources resources = (Resources) composer.consume(AndroidCompositionLocals_androidKt.getLocalResources());
        TypedValue typedValueResolveResourcePath = ((ResourceIdCache) composer.consume(AndroidCompositionLocals_androidKt.getLocalResourceIdCache())).resolveResourcePath(resources, i2);
        CharSequence charSequence = typedValueResolveResourcePath.string;
        if (charSequence == null || !o.S(charSequence, ".xml")) {
            composer.startReplaceGroup(-1771643000);
            boolean zChanged = composer.changed(context.getTheme()) | composer.changed(charSequence) | ((((i3 & 14) ^ 6) > 4 && composer.changed(i2)) || (i3 & 6) == 4);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.Companion.getEmpty()) {
                objRememberedValue = loadImageBitmapResource(charSequence, resources, i2);
                composer.updateRememberedValue(objRememberedValue);
            }
            BitmapPainter bitmapPainter2 = new BitmapPainter((ImageBitmap) objRememberedValue, 0L, 0L, 6, null);
            composer.endReplaceGroup();
            bitmapPainter = bitmapPainter2;
        } else {
            composer.startReplaceGroup(-1771798434);
            VectorPainter vectorPainterRememberVectorPainter = VectorPainterKt.rememberVectorPainter(loadVectorResource(context.getTheme(), resources, i2, typedValueResolveResourcePath.changingConfigurations, composer, (i3 << 6) & DisplayStrings.DS_TAP_TO_VERIFY), composer, 0);
            composer.endReplaceGroup();
            bitmapPainter = vectorPainterRememberVectorPainter;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return bitmapPainter;
    }
}
