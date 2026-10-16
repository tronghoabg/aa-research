.class public final enum LZa/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final b:Lya/b;

.field public static final synthetic c:[LZa/a;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, LZa/a;

    .line 2
    .line 3
    const-string v1, "NOTHING"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-direct {v0, v1, v2, v3}, LZa/a;-><init>(Ljava/lang/String;II)V

    .line 8
    .line 9
    .line 10
    new-instance v1, LZa/a;

    .line 11
    .line 12
    const-string v4, "ONCE"

    .line 13
    .line 14
    const/4 v5, 0x2

    .line 15
    invoke-direct {v1, v4, v3, v5}, LZa/a;-><init>(Ljava/lang/String;II)V

    .line 16
    .line 17
    .line 18
    new-instance v4, LZa/a;

    .line 19
    .line 20
    const-string v6, "REPEAT"

    .line 21
    .line 22
    const/4 v7, 0x3

    .line 23
    invoke-direct {v4, v6, v5, v7}, LZa/a;-><init>(Ljava/lang/String;II)V

    .line 24
    .line 25
    .line 26
    new-array v6, v7, [LZa/a;

    .line 27
    .line 28
    aput-object v0, v6, v2

    .line 29
    .line 30
    aput-object v1, v6, v3

    .line 31
    .line 32
    aput-object v4, v6, v5

    .line 33
    .line 34
    sput-object v6, LZa/a;->c:[LZa/a;

    .line 35
    .line 36
    invoke-static {v6}, Lic/d;->t([Ljava/lang/Enum;)Lmf/b;

    .line 37
    .line 38
    .line 39
    new-instance v0, Lya/b;

    .line 40
    .line 41
    const/16 v1, 0x1d

    .line 42
    .line 43
    invoke-direct {v0, v1}, Lya/b;-><init>(I)V

    .line 44
    .line 45
    .line 46
    sput-object v0, LZa/a;->b:Lya/b;

    .line 47
    .line 48
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, LZa/a;->a:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LZa/a;
    .locals 1

    .line 1
    const-class v0, LZa/a;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LZa/a;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LZa/a;
    .locals 1

    .line 1
    sget-object v0, LZa/a;->c:[LZa/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LZa/a;

    .line 8
    .line 9
    return-object v0
.end method
