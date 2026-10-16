.class public final LE5/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE5/h;


# static fields
.field public static final c:LE5/b0;

.field public static final d:LA5/f;


# instance fields
.field public final a:Landroid/net/Uri;

.field public final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LG9/e;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, LG9/e;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, LE5/b0;

    .line 8
    .line 9
    invoke-direct {v1, v0}, LE5/b0;-><init>(LG9/e;)V

    .line 10
    .line 11
    .line 12
    sput-object v1, LE5/b0;->c:LE5/b0;

    .line 13
    .line 14
    new-instance v0, LA5/f;

    .line 15
    .line 16
    const/16 v1, 0xc

    .line 17
    .line 18
    invoke-direct {v0, v1}, LA5/f;-><init>(I)V

    .line 19
    .line 20
    .line 21
    sput-object v0, LE5/b0;->d:LA5/f;

    .line 22
    .line 23
    return-void
.end method

.method public constructor <init>(LG9/e;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, LG9/e;->b:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Landroid/net/Uri;

    .line 7
    .line 8
    iput-object v0, p0, LE5/b0;->a:Landroid/net/Uri;

    .line 9
    .line 10
    iget-object p1, p1, LG9/e;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Ljava/lang/String;

    .line 13
    .line 14
    iput-object p1, p0, LE5/b0;->b:Ljava/lang/String;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, LE5/b0;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, LE5/b0;

    .line 12
    .line 13
    iget-object v1, p1, LE5/b0;->a:Landroid/net/Uri;

    .line 14
    .line 15
    iget-object v3, p0, LE5/b0;->a:Landroid/net/Uri;

    .line 16
    .line 17
    invoke-static {v3, v1}, Lu6/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    iget-object v1, p0, LE5/b0;->b:Ljava/lang/String;

    .line 24
    .line 25
    iget-object p1, p1, LE5/b0;->b:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v1, p1}, Lu6/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    return v0

    .line 34
    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, LE5/b0;->a:Landroid/net/Uri;

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    move v1, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v1}, Landroid/net/Uri;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    .line 13
    .line 14
    iget-object v2, p0, LE5/b0;->b:Ljava/lang/String;

    .line 15
    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    :goto_1
    add-int/2addr v1, v0

    .line 24
    return v1
.end method
