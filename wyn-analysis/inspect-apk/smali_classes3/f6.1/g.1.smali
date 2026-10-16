.class public final synthetic Lf6/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf6/A;


# instance fields
.field public final synthetic a:Lf6/i;

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lf6/i;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf6/g;->a:Lf6/i;

    iput-object p2, p0, Lf6/g;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lf6/a;LE5/J0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lf6/g;->a:Lf6/i;

    .line 2
    .line 3
    iget-object v1, p0, Lf6/g;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1, p2}, Lf6/i;->u(Ljava/lang/Object;Lf6/a;LE5/J0;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
