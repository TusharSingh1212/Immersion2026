public class abc {
    class FoodItem{
        private int itemID;
        private String itemName;

        public FoodItem(int itemID, String itemName) {
            this.itemID = itemID;
            this.itemName = itemName;
        }

        public int getItemID() {
            return itemID;
        }

        public void setItemID(int itemID) {
            this.itemID = itemID;
        }

        @Override
        public String toString() {
            return "FoodItem [itemID=" + itemID + ", itemName=" + itemName + "]";
        }

        public String getItemName() {
            return itemName;
        }

        public void setItemName(String itemName) {
            this.itemName = itemName;
        }

    }
}