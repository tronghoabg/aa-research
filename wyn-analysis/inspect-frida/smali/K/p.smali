.class public abstract LK/p;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LA/Z;

.field public static final b:LA/Z;

.field public static final c:LA/Z;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, LA/Z;

    .line 2
    .line 3
    sget-object v1, LA/t;->a:LA/q;

    .line 4
    .line 5
    const/16 v2, 0x78

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v2, v1, v3}, LA/Z;-><init>(ILA/r;I)V

    .line 9
    .line 10
    .line 11
    sput-object v0, LK/p;->a:LA/Z;

    .line 12
    .line 13
    new-instance v0, LA/Z;

    .line 14
    .line 15
    new-instance v1, LA/q;

    .line 16
    .line 17
    const v4, 0x3f19999a    # 0.6f

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, v4}, LA/q;-><init>(F)V

    .line 21
    .line 22
    .line 23
    const/16 v5, 0x96

    .line 24
    .line 25
    invoke-direct {v0, v5, v1, v3}, LA/Z;-><init>(ILA/r;I)V

    .line 26
    .line 27
    .line 28
    sput-object v0, LK/p;->b:LA/Z;

    .line 29
    .line 30
    new-instance v0, LA/Z;

    .line 31
    .line 32
    new-instance v1, LA/q;

    .line 33
    .line 34
    invoke-direct {v1, v4}, LA/q;-><init>(F)V

    .line 35
    .line 36
    .line 37
    invoke-direct {v0, v2, v1, v3}, LA/Z;-><init>(ILA/r;I)V

    .line 38
    .line 39
    .line 40
    sput-object v0, LK/p;->c:LA/Z;

    .line 41
    .line 42
    return-void
.end method
