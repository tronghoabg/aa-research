.class public final LI4/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI4/q;
.implements LQ4/a;


# instance fields
.field public final a:Landroid/content/res/Resources;


# direct methods
.method public synthetic constructor <init>(Landroid/content/res/Resources;)V
    .locals 0

    .line 1
    iput-object p1, p0, LI4/x;->a:Landroid/content/res/Resources;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(LI4/v;)LI4/p;
    .locals 3

    .line 1
    new-instance v0, LI4/b;

    .line 2
    .line 3
    const-class v1, Landroid/net/Uri;

    .line 4
    .line 5
    const-class v2, Ljava/io/InputStream;

    .line 6
    .line 7
    invoke-virtual {p1, v1, v2}, LI4/v;->b(Ljava/lang/Class;Ljava/lang/Class;)LI4/p;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object v1, p0, LI4/x;->a:Landroid/content/res/Resources;

    .line 12
    .line 13
    invoke-direct {v0, v1, p1}, LI4/b;-><init>(Landroid/content/res/Resources;LI4/p;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public e(LE4/B;LB4/g;)LE4/B;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    new-instance p2, LL4/c;

    .line 6
    .line 7
    iget-object v0, p0, LI4/x;->a:Landroid/content/res/Resources;

    .line 8
    .line 9
    invoke-direct {p2, v0, p1}, LL4/c;-><init>(Landroid/content/res/Resources;LE4/B;)V

    .line 10
    .line 11
    .line 12
    return-object p2
.end method
