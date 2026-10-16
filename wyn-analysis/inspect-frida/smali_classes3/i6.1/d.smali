.class public final Li6/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:LA0/f;


# instance fields
.field public final a:Lh6/b;

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LA0/f;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-direct {v0, v1}, LA0/f;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Li6/d;->c:LA0/f;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Landroid/text/SpannableStringBuilder;Landroid/text/Layout$Alignment;FIFIZII)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    if-eqz p7, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    move/from16 v18, p8

    .line 10
    .line 11
    :goto_0
    move/from16 v17, v1

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    const/4 v1, 0x0

    .line 15
    const/high16 v2, -0x1000000

    .line 16
    .line 17
    move/from16 v18, v2

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :goto_1
    new-instance v3, Lh6/b;

    .line 21
    .line 22
    const v14, -0x800001

    .line 23
    .line 24
    .line 25
    const/16 v20, 0x0

    .line 26
    .line 27
    const/4 v6, 0x0

    .line 28
    const/4 v9, 0x0

    .line 29
    const/high16 v13, -0x80000000

    .line 30
    .line 31
    const v15, -0x800001

    .line 32
    .line 33
    .line 34
    move-object v7, v6

    .line 35
    move/from16 v16, v14

    .line 36
    .line 37
    move/from16 v19, v13

    .line 38
    .line 39
    move-object/from16 v4, p1

    .line 40
    .line 41
    move-object/from16 v5, p2

    .line 42
    .line 43
    move/from16 v8, p3

    .line 44
    .line 45
    move/from16 v10, p4

    .line 46
    .line 47
    move/from16 v11, p5

    .line 48
    .line 49
    move/from16 v12, p6

    .line 50
    .line 51
    invoke-direct/range {v3 .. v20}, Lh6/b;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIF)V

    .line 52
    .line 53
    .line 54
    iput-object v3, v0, Li6/d;->a:Lh6/b;

    .line 55
    .line 56
    move/from16 v1, p9

    .line 57
    .line 58
    iput v1, v0, Li6/d;->b:I

    .line 59
    .line 60
    return-void
.end method
