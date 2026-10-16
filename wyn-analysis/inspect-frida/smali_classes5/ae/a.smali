.class public final enum Lae/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum b:Lae/a;

.field public static final synthetic c:[Lae/a;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    new-instance v0, Lae/a;

    .line 2
    .line 3
    const-string v1, "Verbose"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lae/a;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lae/a;

    .line 10
    .line 11
    const/16 v3, 0xa

    .line 12
    .line 13
    const-string v4, "Info"

    .line 14
    .line 15
    const/4 v5, 0x1

    .line 16
    invoke-direct {v1, v4, v5, v3}, Lae/a;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lae/a;->b:Lae/a;

    .line 20
    .line 21
    new-instance v3, Lae/a;

    .line 22
    .line 23
    const/16 v4, 0x14

    .line 24
    .line 25
    const-string v6, "Warning"

    .line 26
    .line 27
    const/4 v7, 0x2

    .line 28
    invoke-direct {v3, v6, v7, v4}, Lae/a;-><init>(Ljava/lang/String;II)V

    .line 29
    .line 30
    .line 31
    new-instance v4, Lae/a;

    .line 32
    .line 33
    const/16 v6, 0x1e

    .line 34
    .line 35
    const-string v8, "Error"

    .line 36
    .line 37
    const/4 v9, 0x3

    .line 38
    invoke-direct {v4, v8, v9, v6}, Lae/a;-><init>(Ljava/lang/String;II)V

    .line 39
    .line 40
    .line 41
    new-instance v6, Lae/a;

    .line 42
    .line 43
    const v8, 0x7fffffff

    .line 44
    .line 45
    .line 46
    const-string v10, "Disabled"

    .line 47
    .line 48
    const/4 v11, 0x4

    .line 49
    invoke-direct {v6, v10, v11, v8}, Lae/a;-><init>(Ljava/lang/String;II)V

    .line 50
    .line 51
    .line 52
    const/4 v8, 0x5

    .line 53
    new-array v8, v8, [Lae/a;

    .line 54
    .line 55
    aput-object v0, v8, v2

    .line 56
    .line 57
    aput-object v1, v8, v5

    .line 58
    .line 59
    aput-object v3, v8, v7

    .line 60
    .line 61
    aput-object v4, v8, v9

    .line 62
    .line 63
    aput-object v6, v8, v11

    .line 64
    .line 65
    sput-object v8, Lae/a;->c:[Lae/a;

    .line 66
    .line 67
    invoke-static {v8}, Lic/d;->t([Ljava/lang/Enum;)Lmf/b;

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lae/a;->a:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lae/a;
    .locals 1

    .line 1
    const-class v0, Lae/a;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lae/a;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lae/a;
    .locals 1

    .line 1
    sget-object v0, Lae/a;->c:[Lae/a;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lae/a;

    .line 8
    .line 9
    return-object v0
.end method
