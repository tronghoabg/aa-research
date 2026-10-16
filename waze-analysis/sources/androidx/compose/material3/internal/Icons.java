package androidx.compose.material3.internal;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Icons {
    public static final int $stable = 0;
    public static final Icons INSTANCE = new Icons();

    /* compiled from: WazeSource */
    public final class AutoMirrored {
        public static final int $stable = 0;
        public static final AutoMirrored INSTANCE = new AutoMirrored();

        /* compiled from: WazeSource */
        public final class Filled {
            private static ImageVector _keyboardArrowLeft;
            private static ImageVector _keyboardArrowRight;
            public static final Filled INSTANCE = new Filled();
            public static final int $stable = 8;

            private Filled() {
            }

            public final ImageVector getKeyboardArrowLeft$material3() {
                ImageVector imageVector = _keyboardArrowLeft;
                if (imageVector != null) {
                    return imageVector;
                }
                ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Filled.KeyboardArrowLeft", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96, null);
                int defaultFillType = VectorKt.getDefaultFillType();
                SolidColor solidColor = new SolidColor(Color.Companion.m8254getBlack0d7_KjU(), null);
                int iM8632getButtKaPHkGw = StrokeCap.Companion.m8632getButtKaPHkGw();
                int iM8642getBevelLxFBmk8 = StrokeJoin.Companion.m8642getBevelLxFBmk8();
                PathBuilder pathBuilder = new PathBuilder();
                pathBuilder.moveTo(15.41f, 16.59f);
                pathBuilder.lineTo(10.83f, 12.0f);
                pathBuilder.lineToRelative(4.58f, -4.59f);
                pathBuilder.lineTo(14.0f, 6.0f);
                pathBuilder.lineToRelative(-6.0f, 6.0f);
                pathBuilder.lineToRelative(6.0f, 6.0f);
                pathBuilder.lineToRelative(1.41f, -1.41f);
                pathBuilder.close();
                ImageVector.Builder.m8996addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM8632getButtKaPHkGw, iM8642getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
                ImageVector imageVectorBuild = builder.build();
                _keyboardArrowLeft = imageVectorBuild;
                x.c(imageVectorBuild);
                return imageVectorBuild;
            }

            public final ImageVector getKeyboardArrowRight$material3() {
                ImageVector imageVector = _keyboardArrowRight;
                if (imageVector != null) {
                    return imageVector;
                }
                ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Filled.KeyboardArrowRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96, null);
                int defaultFillType = VectorKt.getDefaultFillType();
                SolidColor solidColor = new SolidColor(Color.Companion.m8254getBlack0d7_KjU(), null);
                int iM8632getButtKaPHkGw = StrokeCap.Companion.m8632getButtKaPHkGw();
                int iM8642getBevelLxFBmk8 = StrokeJoin.Companion.m8642getBevelLxFBmk8();
                PathBuilder pathBuilder = new PathBuilder();
                pathBuilder.moveTo(8.59f, 16.59f);
                pathBuilder.lineTo(13.17f, 12.0f);
                pathBuilder.lineTo(8.59f, 7.41f);
                pathBuilder.lineTo(10.0f, 6.0f);
                pathBuilder.lineToRelative(6.0f, 6.0f);
                pathBuilder.lineToRelative(-6.0f, 6.0f);
                pathBuilder.lineToRelative(-1.41f, -1.41f);
                pathBuilder.close();
                ImageVector.Builder.m8996addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM8632getButtKaPHkGw, iM8642getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
                ImageVector imageVectorBuild = builder.build();
                _keyboardArrowRight = imageVectorBuild;
                x.c(imageVectorBuild);
                return imageVectorBuild;
            }
        }

        private AutoMirrored() {
        }
    }

    /* compiled from: WazeSource */
    public final class Filled {
        private static ImageVector _arrowDropDown;
        private static ImageVector _check;
        private static ImageVector _close;
        private static ImageVector _dateRange;
        private static ImageVector _edit;
        private static ImageVector _moreVert;
        public static final Filled INSTANCE = new Filled();
        public static final int $stable = 8;

        private Filled() {
        }

        public final ImageVector getArrowDropDown$material3() {
            ImageVector imageVector = _arrowDropDown;
            if (imageVector != null) {
                return imageVector;
            }
            ImageVector.Builder builder = new ImageVector.Builder("Filled.ArrowDropDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224, null);
            int defaultFillType = VectorKt.getDefaultFillType();
            SolidColor solidColor = new SolidColor(Color.Companion.m8254getBlack0d7_KjU(), null);
            int iM8632getButtKaPHkGw = StrokeCap.Companion.m8632getButtKaPHkGw();
            int iM8642getBevelLxFBmk8 = StrokeJoin.Companion.m8642getBevelLxFBmk8();
            PathBuilder pathBuilder = new PathBuilder();
            pathBuilder.moveTo(7.0f, 10.0f);
            pathBuilder.lineToRelative(5.0f, 5.0f);
            pathBuilder.lineToRelative(5.0f, -5.0f);
            pathBuilder.close();
            ImageVector.Builder.m8996addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM8632getButtKaPHkGw, iM8642getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
            ImageVector imageVectorBuild = builder.build();
            _arrowDropDown = imageVectorBuild;
            x.c(imageVectorBuild);
            return imageVectorBuild;
        }

        public final ImageVector getCheck$material3() {
            ImageVector imageVector = _check;
            if (imageVector != null) {
                return imageVector;
            }
            ImageVector.Builder builder = new ImageVector.Builder("Filled.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224, null);
            int defaultFillType = VectorKt.getDefaultFillType();
            SolidColor solidColor = new SolidColor(Color.Companion.m8254getBlack0d7_KjU(), null);
            int iM8632getButtKaPHkGw = StrokeCap.Companion.m8632getButtKaPHkGw();
            int iM8642getBevelLxFBmk8 = StrokeJoin.Companion.m8642getBevelLxFBmk8();
            PathBuilder pathBuilder = new PathBuilder();
            pathBuilder.moveTo(9.0f, 16.17f);
            pathBuilder.lineTo(4.83f, 12.0f);
            pathBuilder.lineToRelative(-1.42f, 1.41f);
            pathBuilder.lineTo(9.0f, 19.0f);
            pathBuilder.lineTo(21.0f, 7.0f);
            pathBuilder.lineToRelative(-1.41f, -1.41f);
            pathBuilder.close();
            ImageVector.Builder.m8996addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM8632getButtKaPHkGw, iM8642getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
            ImageVector imageVectorBuild = builder.build();
            _check = imageVectorBuild;
            x.c(imageVectorBuild);
            return imageVectorBuild;
        }

        public final ImageVector getClose$material3() {
            ImageVector imageVector = _close;
            if (imageVector != null) {
                return imageVector;
            }
            ImageVector.Builder builder = new ImageVector.Builder("Filled.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224, null);
            int defaultFillType = VectorKt.getDefaultFillType();
            SolidColor solidColor = new SolidColor(Color.Companion.m8254getBlack0d7_KjU(), null);
            int iM8632getButtKaPHkGw = StrokeCap.Companion.m8632getButtKaPHkGw();
            int iM8642getBevelLxFBmk8 = StrokeJoin.Companion.m8642getBevelLxFBmk8();
            PathBuilder pathBuilder = new PathBuilder();
            pathBuilder.moveTo(19.0f, 6.41f);
            pathBuilder.lineTo(17.59f, 5.0f);
            pathBuilder.lineTo(12.0f, 10.59f);
            pathBuilder.lineTo(6.41f, 5.0f);
            pathBuilder.lineTo(5.0f, 6.41f);
            pathBuilder.lineTo(10.59f, 12.0f);
            pathBuilder.lineTo(5.0f, 17.59f);
            pathBuilder.lineTo(6.41f, 19.0f);
            pathBuilder.lineTo(12.0f, 13.41f);
            pathBuilder.lineTo(17.59f, 19.0f);
            pathBuilder.lineTo(19.0f, 17.59f);
            pathBuilder.lineTo(13.41f, 12.0f);
            pathBuilder.close();
            ImageVector.Builder.m8996addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM8632getButtKaPHkGw, iM8642getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
            ImageVector imageVectorBuild = builder.build();
            _close = imageVectorBuild;
            x.c(imageVectorBuild);
            return imageVectorBuild;
        }

        public final ImageVector getDateRange$material3() {
            ImageVector imageVector = _dateRange;
            if (imageVector != null) {
                return imageVector;
            }
            ImageVector.Builder builder = new ImageVector.Builder("Filled.DateRange", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224, null);
            int defaultFillType = VectorKt.getDefaultFillType();
            SolidColor solidColor = new SolidColor(Color.Companion.m8254getBlack0d7_KjU(), null);
            int iM8632getButtKaPHkGw = StrokeCap.Companion.m8632getButtKaPHkGw();
            int iM8642getBevelLxFBmk8 = StrokeJoin.Companion.m8642getBevelLxFBmk8();
            PathBuilder pathBuilder = new PathBuilder();
            pathBuilder.moveTo(9.0f, 11.0f);
            pathBuilder.lineTo(7.0f, 11.0f);
            pathBuilder.verticalLineToRelative(2.0f);
            pathBuilder.horizontalLineToRelative(2.0f);
            pathBuilder.verticalLineToRelative(-2.0f);
            pathBuilder.close();
            pathBuilder.moveTo(13.0f, 11.0f);
            pathBuilder.horizontalLineToRelative(-2.0f);
            pathBuilder.verticalLineToRelative(2.0f);
            pathBuilder.horizontalLineToRelative(2.0f);
            pathBuilder.verticalLineToRelative(-2.0f);
            pathBuilder.close();
            pathBuilder.moveTo(17.0f, 11.0f);
            pathBuilder.horizontalLineToRelative(-2.0f);
            pathBuilder.verticalLineToRelative(2.0f);
            pathBuilder.horizontalLineToRelative(2.0f);
            pathBuilder.verticalLineToRelative(-2.0f);
            pathBuilder.close();
            pathBuilder.moveTo(19.0f, 4.0f);
            pathBuilder.horizontalLineToRelative(-1.0f);
            pathBuilder.lineTo(18.0f, 2.0f);
            pathBuilder.horizontalLineToRelative(-2.0f);
            pathBuilder.verticalLineToRelative(2.0f);
            pathBuilder.lineTo(8.0f, 4.0f);
            pathBuilder.lineTo(8.0f, 2.0f);
            pathBuilder.lineTo(6.0f, 2.0f);
            pathBuilder.verticalLineToRelative(2.0f);
            pathBuilder.lineTo(5.0f, 4.0f);
            pathBuilder.curveToRelative(-1.11f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
            pathBuilder.lineTo(3.0f, 20.0f);
            pathBuilder.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
            pathBuilder.horizontalLineToRelative(14.0f);
            pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
            pathBuilder.lineTo(21.0f, 6.0f);
            pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
            pathBuilder.close();
            pathBuilder.moveTo(19.0f, 20.0f);
            pathBuilder.lineTo(5.0f, 20.0f);
            pathBuilder.lineTo(5.0f, 9.0f);
            pathBuilder.horizontalLineToRelative(14.0f);
            pathBuilder.verticalLineToRelative(11.0f);
            pathBuilder.close();
            ImageVector.Builder.m8996addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM8632getButtKaPHkGw, iM8642getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
            ImageVector imageVectorBuild = builder.build();
            _dateRange = imageVectorBuild;
            x.c(imageVectorBuild);
            return imageVectorBuild;
        }

        public final ImageVector getEdit$material3() {
            ImageVector imageVector = _edit;
            if (imageVector != null) {
                return imageVector;
            }
            ImageVector.Builder builder = new ImageVector.Builder("Filled.Edit", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224, null);
            int defaultFillType = VectorKt.getDefaultFillType();
            SolidColor solidColor = new SolidColor(Color.Companion.m8254getBlack0d7_KjU(), null);
            int iM8632getButtKaPHkGw = StrokeCap.Companion.m8632getButtKaPHkGw();
            int iM8642getBevelLxFBmk8 = StrokeJoin.Companion.m8642getBevelLxFBmk8();
            PathBuilder pathBuilder = new PathBuilder();
            pathBuilder.moveTo(3.0f, 17.25f);
            pathBuilder.verticalLineTo(21.0f);
            pathBuilder.horizontalLineToRelative(3.75f);
            pathBuilder.lineTo(17.81f, 9.94f);
            pathBuilder.lineToRelative(-3.75f, -3.75f);
            pathBuilder.lineTo(3.0f, 17.25f);
            pathBuilder.close();
            pathBuilder.moveTo(20.71f, 7.04f);
            pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
            pathBuilder.lineToRelative(-2.34f, -2.34f);
            pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
            pathBuilder.lineToRelative(-1.83f, 1.83f);
            pathBuilder.lineToRelative(3.75f, 3.75f);
            pathBuilder.lineToRelative(1.83f, -1.83f);
            pathBuilder.close();
            ImageVector.Builder.m8996addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM8632getButtKaPHkGw, iM8642getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
            ImageVector imageVectorBuild = builder.build();
            _edit = imageVectorBuild;
            x.c(imageVectorBuild);
            return imageVectorBuild;
        }

        public final ImageVector getMoreVert$material3() {
            ImageVector imageVector = _moreVert;
            if (imageVector != null) {
                return imageVector;
            }
            ImageVector.Builder builder = new ImageVector.Builder("Filled.MoreVert", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224, null);
            int defaultFillType = VectorKt.getDefaultFillType();
            SolidColor solidColor = new SolidColor(Color.Companion.m8254getBlack0d7_KjU(), null);
            int iM8632getButtKaPHkGw = StrokeCap.Companion.m8632getButtKaPHkGw();
            int iM8642getBevelLxFBmk8 = StrokeJoin.Companion.m8642getBevelLxFBmk8();
            PathBuilder pathBuilder = new PathBuilder();
            pathBuilder.moveTo(12.0f, 8.0f);
            pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
            pathBuilder.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
            pathBuilder.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
            pathBuilder.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
            pathBuilder.close();
            pathBuilder.moveTo(12.0f, 10.0f);
            pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
            pathBuilder.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
            pathBuilder.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
            pathBuilder.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
            pathBuilder.close();
            pathBuilder.moveTo(12.0f, 16.0f);
            pathBuilder.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
            pathBuilder.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
            pathBuilder.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
            pathBuilder.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
            pathBuilder.close();
            ImageVector.Builder.m8996addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM8632getButtKaPHkGw, iM8642getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
            ImageVector imageVectorBuild = builder.build();
            _moreVert = imageVectorBuild;
            x.c(imageVectorBuild);
            return imageVectorBuild;
        }
    }

    /* compiled from: WazeSource */
    public final class Outlined {
        private static ImageVector _keyboard;
        private static ImageVector _schedule;
        public static final Outlined INSTANCE = new Outlined();
        public static final int $stable = 8;

        private Outlined() {
        }

        public final ImageVector getKeyboard() {
            ImageVector imageVector = _keyboard;
            if (imageVector != null) {
                return imageVector;
            }
            ImageVector.Builder builder = new ImageVector.Builder("Outlined.Keyboard", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224, null);
            int defaultFillType = VectorKt.getDefaultFillType();
            SolidColor solidColor = new SolidColor(Color.Companion.m8254getBlack0d7_KjU(), null);
            int iM8632getButtKaPHkGw = StrokeCap.Companion.m8632getButtKaPHkGw();
            int iM8642getBevelLxFBmk8 = StrokeJoin.Companion.m8642getBevelLxFBmk8();
            PathBuilder pathBuilder = new PathBuilder();
            pathBuilder.moveTo(20.0f, 7.0f);
            pathBuilder.verticalLineToRelative(10.0f);
            pathBuilder.lineTo(4.0f, 17.0f);
            pathBuilder.lineTo(4.0f, 7.0f);
            pathBuilder.horizontalLineToRelative(16.0f);
            pathBuilder.moveToRelative(0.0f, -2.0f);
            pathBuilder.lineTo(4.0f, 5.0f);
            pathBuilder.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
            pathBuilder.lineTo(2.0f, 17.0f);
            pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
            pathBuilder.horizontalLineToRelative(16.0f);
            pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
            pathBuilder.lineTo(22.0f, 7.0f);
            pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
            pathBuilder.close();
            pathBuilder.moveTo(11.0f, 8.0f);
            pathBuilder.horizontalLineToRelative(2.0f);
            pathBuilder.verticalLineToRelative(2.0f);
            pathBuilder.horizontalLineToRelative(-2.0f);
            pathBuilder.close();
            pathBuilder.moveTo(11.0f, 11.0f);
            pathBuilder.horizontalLineToRelative(2.0f);
            pathBuilder.verticalLineToRelative(2.0f);
            pathBuilder.horizontalLineToRelative(-2.0f);
            pathBuilder.close();
            pathBuilder.moveTo(8.0f, 8.0f);
            pathBuilder.horizontalLineToRelative(2.0f);
            pathBuilder.verticalLineToRelative(2.0f);
            pathBuilder.lineTo(8.0f, 10.0f);
            pathBuilder.close();
            pathBuilder.moveTo(8.0f, 11.0f);
            pathBuilder.horizontalLineToRelative(2.0f);
            pathBuilder.verticalLineToRelative(2.0f);
            pathBuilder.lineTo(8.0f, 13.0f);
            pathBuilder.close();
            pathBuilder.moveTo(5.0f, 11.0f);
            pathBuilder.horizontalLineToRelative(2.0f);
            pathBuilder.verticalLineToRelative(2.0f);
            pathBuilder.lineTo(5.0f, 13.0f);
            pathBuilder.close();
            pathBuilder.moveTo(5.0f, 8.0f);
            pathBuilder.horizontalLineToRelative(2.0f);
            pathBuilder.verticalLineToRelative(2.0f);
            pathBuilder.lineTo(5.0f, 10.0f);
            pathBuilder.close();
            pathBuilder.moveTo(8.0f, 14.0f);
            pathBuilder.horizontalLineToRelative(8.0f);
            pathBuilder.verticalLineToRelative(2.0f);
            pathBuilder.lineTo(8.0f, 16.0f);
            pathBuilder.close();
            pathBuilder.moveTo(14.0f, 11.0f);
            pathBuilder.horizontalLineToRelative(2.0f);
            pathBuilder.verticalLineToRelative(2.0f);
            pathBuilder.horizontalLineToRelative(-2.0f);
            pathBuilder.close();
            pathBuilder.moveTo(14.0f, 8.0f);
            pathBuilder.horizontalLineToRelative(2.0f);
            pathBuilder.verticalLineToRelative(2.0f);
            pathBuilder.horizontalLineToRelative(-2.0f);
            pathBuilder.close();
            pathBuilder.moveTo(17.0f, 11.0f);
            pathBuilder.horizontalLineToRelative(2.0f);
            pathBuilder.verticalLineToRelative(2.0f);
            pathBuilder.horizontalLineToRelative(-2.0f);
            pathBuilder.close();
            pathBuilder.moveTo(17.0f, 8.0f);
            pathBuilder.horizontalLineToRelative(2.0f);
            pathBuilder.verticalLineToRelative(2.0f);
            pathBuilder.horizontalLineToRelative(-2.0f);
            pathBuilder.close();
            ImageVector.Builder.m8996addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM8632getButtKaPHkGw, iM8642getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
            ImageVector imageVectorBuild = builder.build();
            _keyboard = imageVectorBuild;
            x.c(imageVectorBuild);
            return imageVectorBuild;
        }

        public final ImageVector getSchedule() {
            ImageVector imageVector = _schedule;
            if (imageVector != null) {
                return imageVector;
            }
            ImageVector.Builder builder = new ImageVector.Builder("Outlined.Schedule", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224, null);
            int defaultFillType = VectorKt.getDefaultFillType();
            SolidColor solidColor = new SolidColor(Color.Companion.m8254getBlack0d7_KjU(), null);
            int iM8632getButtKaPHkGw = StrokeCap.Companion.m8632getButtKaPHkGw();
            int iM8642getBevelLxFBmk8 = StrokeJoin.Companion.m8642getBevelLxFBmk8();
            PathBuilder pathBuilder = new PathBuilder();
            pathBuilder.moveTo(11.99f, 2.0f);
            pathBuilder.curveTo(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
            pathBuilder.reflectiveCurveToRelative(4.47f, 10.0f, 9.99f, 10.0f);
            pathBuilder.curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
            pathBuilder.reflectiveCurveTo(17.52f, 2.0f, 11.99f, 2.0f);
            pathBuilder.close();
            pathBuilder.moveTo(12.0f, 20.0f);
            pathBuilder.curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
            pathBuilder.reflectiveCurveToRelative(3.58f, -8.0f, 8.0f, -8.0f);
            pathBuilder.reflectiveCurveToRelative(8.0f, 3.58f, 8.0f, 8.0f);
            pathBuilder.reflectiveCurveToRelative(-3.58f, 8.0f, -8.0f, 8.0f);
            pathBuilder.close();
            pathBuilder.moveTo(12.5f, 7.0f);
            pathBuilder.lineTo(11.0f, 7.0f);
            pathBuilder.verticalLineToRelative(6.0f);
            pathBuilder.lineToRelative(5.25f, 3.15f);
            pathBuilder.lineToRelative(0.75f, -1.23f);
            pathBuilder.lineToRelative(-4.5f, -2.67f);
            pathBuilder.close();
            ImageVector.Builder.m8996addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, iM8632getButtKaPHkGw, iM8642getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
            ImageVector imageVectorBuild = builder.build();
            _schedule = imageVectorBuild;
            x.c(imageVectorBuild);
            return imageVectorBuild;
        }
    }

    private Icons() {
    }
}
