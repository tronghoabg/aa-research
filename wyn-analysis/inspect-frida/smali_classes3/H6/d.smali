.class public final LH6/d;
.super Ljava/lang/Thread;
.source "SourceFile"


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public constructor <init>(LH6/f;Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p2, p0, LH6/d;->a:Landroid/content/Context;

    .line 2
    .line 3
    iput-object p3, p0, LH6/d;->b:Ljava/lang/String;

    .line 4
    .line 5
    invoke-static {p1}, Lj$/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    new-instance v0, LH6/p;

    .line 2
    .line 3
    iget-object v1, p0, LH6/d;->a:Landroid/content/Context;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, LH6/p;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, LH6/d;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v0, v2, v1}, LH6/p;->a(Ljava/util/HashMap;Ljava/lang/String;)LH6/o;

    .line 12
    .line 13
    .line 14
    return-void
.end method
