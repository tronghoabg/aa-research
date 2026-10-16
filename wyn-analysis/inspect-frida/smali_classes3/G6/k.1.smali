.class public final LG6/k;
.super LD6/v0;
.source "SourceFile"


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:LG6/m;


# direct methods
.method public constructor <init>(LG6/m;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p2, p0, LG6/k;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, LG6/k;->b:LG6/m;

    .line 7
    .line 8
    invoke-direct {p0}, LD6/v0;-><init>()V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final zze(LD6/K0;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, LG6/k;->a:Landroid/content/Context;

    .line 5
    .line 6
    iget-object p1, p1, LD6/K0;->b:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v1, p0, LG6/k;->b:LG6/m;

    .line 9
    .line 10
    const/4 v2, 0x1

    .line 11
    invoke-virtual {v1, v0, p1, v2, v2}, LG6/m;->i(Landroid/content/Context;Ljava/lang/String;ZZ)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
