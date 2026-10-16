.class public final enum LMa/h;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum b:LMa/h;

.field public static final enum c:LMa/h;

.field public static final enum d:LMa/h;

.field public static final synthetic e:[LMa/h;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, LMa/h;

    .line 2
    .line 3
    const-string v1, "native"

    .line 4
    .line 5
    const-string v2, "NATIVE"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v2, v3, v1}, LMa/h;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, LMa/h;->b:LMa/h;

    .line 12
    .line 13
    new-instance v1, LMa/h;

    .line 14
    .line 15
    const-string v2, "javascript"

    .line 16
    .line 17
    const-string v4, "JAVASCRIPT"

    .line 18
    .line 19
    const/4 v5, 0x1

    .line 20
    invoke-direct {v1, v4, v5, v2}, LMa/h;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, LMa/h;->c:LMa/h;

    .line 24
    .line 25
    new-instance v2, LMa/h;

    .line 26
    .line 27
    const-string v4, "none"

    .line 28
    .line 29
    const-string v6, "NONE"

    .line 30
    .line 31
    const/4 v7, 0x2

    .line 32
    invoke-direct {v2, v6, v7, v4}, LMa/h;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v2, LMa/h;->d:LMa/h;

    .line 36
    .line 37
    const/4 v4, 0x3

    .line 38
    new-array v4, v4, [LMa/h;

    .line 39
    .line 40
    aput-object v0, v4, v3

    .line 41
    .line 42
    aput-object v1, v4, v5

    .line 43
    .line 44
    aput-object v2, v4, v7

    .line 45
    .line 46
    sput-object v4, LMa/h;->e:[LMa/h;

    .line 47
    .line 48
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, LMa/h;->a:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LMa/h;
    .locals 1

    .line 1
    const-class v0, LMa/h;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LMa/h;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LMa/h;
    .locals 1

    .line 1
    sget-object v0, LMa/h;->e:[LMa/h;

    .line 2
    .line 3
    invoke-virtual {v0}, [LMa/h;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LMa/h;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LMa/h;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
