.class public final enum Ll4/d;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum a:Ll4/d;

.field public static final enum b:Ll4/d;

.field public static final enum c:Ll4/d;

.field public static final synthetic d:[Ll4/d;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    const/4 v0, 0x2

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    new-instance v3, Ll4/d;

    .line 5
    .line 6
    const-string v4, "START"

    .line 7
    .line 8
    invoke-direct {v3, v4, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 9
    .line 10
    .line 11
    sput-object v3, Ll4/d;->a:Ll4/d;

    .line 12
    .line 13
    new-instance v4, Ll4/d;

    .line 14
    .line 15
    const-string v5, "CENTER"

    .line 16
    .line 17
    invoke-direct {v4, v5, v1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 18
    .line 19
    .line 20
    sput-object v4, Ll4/d;->b:Ll4/d;

    .line 21
    .line 22
    new-instance v5, Ll4/d;

    .line 23
    .line 24
    const-string v6, "END"

    .line 25
    .line 26
    invoke-direct {v5, v6, v0}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v5, Ll4/d;->c:Ll4/d;

    .line 30
    .line 31
    const/4 v6, 0x3

    .line 32
    new-array v6, v6, [Ll4/d;

    .line 33
    .line 34
    aput-object v3, v6, v2

    .line 35
    .line 36
    aput-object v4, v6, v1

    .line 37
    .line 38
    aput-object v5, v6, v0

    .line 39
    .line 40
    sput-object v6, Ll4/d;->d:[Ll4/d;

    .line 41
    .line 42
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ll4/d;
    .locals 1

    .line 1
    const-class v0, Ll4/d;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ll4/d;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Ll4/d;
    .locals 1

    .line 1
    sget-object v0, Ll4/d;->d:[Ll4/d;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ll4/d;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Ll4/d;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-eq v0, v1, :cond_1

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    const v0, 0x800005

    .line 14
    .line 15
    .line 16
    return v0

    .line 17
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v1, "Invalid gravity constant"

    .line 20
    .line 21
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    throw v0

    .line 25
    :cond_1
    return v1

    .line 26
    :cond_2
    const v0, 0x800003

    .line 27
    .line 28
    .line 29
    return v0
.end method
