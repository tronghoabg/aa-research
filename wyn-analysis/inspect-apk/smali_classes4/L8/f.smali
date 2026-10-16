.class public interface abstract LL8/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final O8:LJ9/x;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LJ9/x;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    invoke-direct {v0, v1}, LJ9/x;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LL8/f;->O8:LJ9/x;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public abstract b(Lcom/google/firebase/components/ComponentRegistrar;)Ljava/util/List;
.end method
