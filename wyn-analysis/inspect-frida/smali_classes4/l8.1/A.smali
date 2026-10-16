.class public abstract Ll8/A;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ll8/y;

.field public static final b:Ll8/z;

.field public static final c:Ll8/z;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ll8/y;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ll8/A;->a:Ll8/y;

    .line 7
    .line 8
    new-instance v0, Ll8/z;

    .line 9
    .line 10
    const/4 v1, -0x1

    .line 11
    invoke-direct {v0, v1}, Ll8/z;-><init>(I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Ll8/A;->b:Ll8/z;

    .line 15
    .line 16
    new-instance v0, Ll8/z;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-direct {v0, v1}, Ll8/z;-><init>(I)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Ll8/A;->c:Ll8/z;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public abstract a(II)Ll8/A;
.end method

.method public abstract b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Ll8/A;
.end method

.method public abstract c(ZZ)Ll8/A;
.end method

.method public abstract d(ZZ)Ll8/A;
.end method

.method public abstract e()I
.end method
