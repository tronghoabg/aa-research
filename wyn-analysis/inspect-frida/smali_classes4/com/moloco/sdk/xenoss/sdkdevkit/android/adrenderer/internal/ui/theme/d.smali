.class public abstract Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/theme/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LK/e;

.field public static final b:LK/e;


# direct methods
.method static constructor <clinit>()V
    .locals 26

    .line 1
    sget-wide v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/theme/a;->a:J

    .line 2
    .line 3
    sget-wide v5, Le0/q;->d:J

    .line 4
    .line 5
    sget-object v2, LK/g;->a:LN/L0;

    .line 6
    .line 7
    const-wide v2, 0xff121212L

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    invoke-static {v2, v3}, Le0/z;->c(J)J

    .line 13
    .line 14
    .line 15
    move-result-wide v9

    .line 16
    invoke-static {v2, v3}, Le0/z;->c(J)J

    .line 17
    .line 18
    .line 19
    move-result-wide v11

    .line 20
    const-wide v2, 0xffcf6679L

    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    invoke-static {v2, v3}, Le0/z;->c(J)J

    .line 26
    .line 27
    .line 28
    move-result-wide v13

    .line 29
    sget-wide v15, Le0/q;->b:J

    .line 30
    .line 31
    move-wide v1, v0

    .line 32
    new-instance v0, LK/e;

    .line 33
    .line 34
    const/16 v25, 0x0

    .line 35
    .line 36
    move-wide v3, v1

    .line 37
    move-wide v7, v5

    .line 38
    move-wide/from16 v17, v15

    .line 39
    .line 40
    move-wide/from16 v19, v5

    .line 41
    .line 42
    move-wide/from16 v21, v5

    .line 43
    .line 44
    move-wide/from16 v23, v15

    .line 45
    .line 46
    invoke-direct/range {v0 .. v25}, LK/e;-><init>(JJJJJJJJJJJJZ)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/theme/d;->a:LK/e;

    .line 50
    .line 51
    const/16 v4, 0xff8

    .line 52
    .line 53
    move-wide v0, v1

    .line 54
    move-wide v2, v0

    .line 55
    invoke-static/range {v0 .. v6}, LK/g;->c(JJIJ)LK/e;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sput-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/theme/d;->b:LK/e;

    .line 60
    .line 61
    return-void
.end method

.method public static final a(ZLV/d;LN/o;I)V
    .locals 8

    .line 1
    const v0, 0x9596733

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, LN/o;->N(I)LN/o;

    .line 5
    .line 6
    .line 7
    or-int/lit8 v0, p3, 0x2

    .line 8
    .line 9
    and-int/lit8 v0, v0, 0x13

    .line 10
    .line 11
    const/16 v1, 0x12

    .line 12
    .line 13
    if-ne v0, v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p2}, LN/o;->x()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p2}, LN/o;->I()V

    .line 23
    .line 24
    .line 25
    move-object v4, p1

    .line 26
    move-object v5, p2

    .line 27
    goto :goto_5

    .line 28
    :cond_1
    :goto_0
    invoke-virtual {p2}, LN/o;->K()V

    .line 29
    .line 30
    .line 31
    and-int/lit8 v0, p3, 0x1

    .line 32
    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    invoke-virtual {p2}, LN/o;->w()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    invoke-virtual {p2}, LN/o;->I()V

    .line 43
    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_3
    :goto_1
    sget-object p0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a:LN/D;

    .line 47
    .line 48
    invoke-virtual {p2, p0}, LN/o;->j(LN/f0;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    check-cast p0, Landroid/content/res/Configuration;

    .line 53
    .line 54
    iget p0, p0, Landroid/content/res/Configuration;->uiMode:I

    .line 55
    .line 56
    and-int/lit8 p0, p0, 0x30

    .line 57
    .line 58
    const/16 v0, 0x20

    .line 59
    .line 60
    if-ne p0, v0, :cond_4

    .line 61
    .line 62
    const/4 p0, 0x1

    .line 63
    goto :goto_2

    .line 64
    :cond_4
    const/4 p0, 0x0

    .line 65
    :goto_2
    invoke-virtual {p2}, LN/o;->q()V

    .line 66
    .line 67
    .line 68
    if-eqz p0, :cond_5

    .line 69
    .line 70
    sget-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/theme/d;->a:LK/e;

    .line 71
    .line 72
    :goto_3
    move-object v1, v0

    .line 73
    goto :goto_4

    .line 74
    :cond_5
    sget-object v0, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/theme/d;->b:LK/e;

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :goto_4
    sget-object v2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/theme/e;->a:LK/L;

    .line 78
    .line 79
    sget-object v3, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/theme/b;->a:LK/z;

    .line 80
    .line 81
    const/16 v6, 0xdb0

    .line 82
    .line 83
    const/4 v7, 0x0

    .line 84
    move-object v4, p1

    .line 85
    move-object v5, p2

    .line 86
    invoke-static/range {v1 .. v7}, LFe/c;->c(LK/e;LK/L;LK/z;LV/d;LN/o;II)V

    .line 87
    .line 88
    .line 89
    :goto_5
    invoke-virtual {v5}, LN/o;->r()LN/i0;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    if-eqz p1, :cond_6

    .line 94
    .line 95
    new-instance p2, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/theme/c;

    .line 96
    .line 97
    invoke-direct {p2, p0, v4, p3}, Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/ui/theme/c;-><init>(ZLV/d;I)V

    .line 98
    .line 99
    .line 100
    iput-object p2, p1, LN/i0;->d:Ltf/p;

    .line 101
    .line 102
    :cond_6
    return-void
.end method
