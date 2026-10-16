package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class SimpleCursorAdapter extends ResourceCursorAdapter {
    private CursorToStringConverter mCursorToStringConverter;
    protected int[] mFrom;
    String[] mOriginalFrom;
    private int mStringConversionColumn;
    protected int[] mTo;
    private ViewBinder mViewBinder;

    /* compiled from: WazeSource */
    public interface CursorToStringConverter {
        CharSequence convertToString(Cursor cursor);
    }

    /* compiled from: WazeSource */
    public interface ViewBinder {
        boolean setViewValue(View view, Cursor cursor, int i2);
    }

    @Deprecated
    public SimpleCursorAdapter(Context context, int i2, Cursor cursor, String[] strArr, int[] iArr) {
        super(context, i2, cursor);
        this.mStringConversionColumn = -1;
        this.mTo = iArr;
        this.mOriginalFrom = strArr;
        findColumns(cursor, strArr);
    }

    private void findColumns(Cursor cursor, String[] strArr) {
        if (cursor == null || strArr == null) {
            this.mFrom = null;
            return;
        }
        int[] iArr = this.mFrom;
        int length = strArr.length;
        if (iArr == null || iArr.length != length) {
            this.mFrom = new int[length];
        }
        for (int i2 = 0; i2 < length; i2++) {
            this.mFrom[i2] = cursor.getColumnIndexOrThrow(strArr[i2]);
        }
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public void bindView(View view, Context context, Cursor cursor) {
        int[] iArr;
        int[] iArr2 = this.mTo;
        if (iArr2 != null && (iArr = this.mFrom) != null) {
            int length = iArr.length;
            int length2 = iArr2.length;
            if (length2 == length) {
                ViewBinder viewBinder = this.mViewBinder;
                for (int i2 = 0; i2 < length2; i2++) {
                    View viewFindViewById = view.findViewById(iArr2[i2]);
                    if (viewFindViewById != null && (viewBinder == null || !viewBinder.setViewValue(viewFindViewById, cursor, iArr[i2]))) {
                        String string = cursor.getString(iArr[i2]);
                        if (string == null) {
                            string = "";
                        }
                        if (viewFindViewById instanceof TextView) {
                            setViewText((TextView) viewFindViewById, string);
                        } else {
                            if (!(viewFindViewById instanceof ImageView)) {
                                throw new IllegalStateException(String.valueOf(viewFindViewById.getClass().getName()).concat(" is not a  view that can be bounds by this SimpleCursorAdapter"));
                            }
                            setViewImage((ImageView) viewFindViewById, string);
                        }
                    }
                }
                return;
            }
        }
        throw new IllegalStateException("The `to` and `from` arrays must be non-null and of equal length for binding to occur");
    }

    public void changeCursorAndColumns(Cursor cursor, String[] strArr, int[] iArr) {
        this.mOriginalFrom = strArr;
        this.mTo = iArr;
        findColumns(cursor, strArr);
        super.changeCursor(cursor);
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter, androidx.cursoradapter.widget.CursorFilter.CursorFilterClient
    public CharSequence convertToString(Cursor cursor) {
        CursorToStringConverter cursorToStringConverter = this.mCursorToStringConverter;
        if (cursorToStringConverter != null) {
            return cursorToStringConverter.convertToString(cursor);
        }
        int i2 = this.mStringConversionColumn;
        return (i2 < 0 || cursor == null) ? super.convertToString(cursor) : cursor.getString(i2);
    }

    public CursorToStringConverter getCursorToStringConverter() {
        return this.mCursorToStringConverter;
    }

    public int getStringConversionColumn() {
        return this.mStringConversionColumn;
    }

    public ViewBinder getViewBinder() {
        return this.mViewBinder;
    }

    public void setCursorToStringConverter(CursorToStringConverter cursorToStringConverter) {
        this.mCursorToStringConverter = cursorToStringConverter;
    }

    public void setStringConversionColumn(int i2) {
        this.mStringConversionColumn = i2;
    }

    public void setViewBinder(ViewBinder viewBinder) {
        this.mViewBinder = viewBinder;
    }

    public void setViewImage(ImageView imageView, String str) {
        try {
            imageView.setImageResource(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            imageView.setImageURI(Uri.parse(str));
        }
    }

    public void setViewText(TextView textView, String str) {
        textView.setText(str);
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public Cursor swapCursor(Cursor cursor) {
        findColumns(cursor, this.mOriginalFrom);
        return super.swapCursor(cursor);
    }

    public SimpleCursorAdapter(Context context, int i2, Cursor cursor, String[] strArr, int[] iArr, int i3) {
        super(context, i2, cursor, i3);
        this.mStringConversionColumn = -1;
        this.mTo = iArr;
        this.mOriginalFrom = strArr;
        findColumns(cursor, strArr);
    }
}
